package com.example;

import com.example.dentalbonusbookletcomposition.DentalBonusBookletComposition;
import com.example.dentalbonusbookletcomposition.DentalBonusBookletTemplateProvider;
import com.example.dentalbonusbookletcomposition.mapper.DentalBonusBookletMapper;
import com.nedap.archie.rm.RMObject;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.client.openehrclient.EhrEndpoint;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.openehrclient.VersionUid;
import org.ehrbase.client.openehrclient.defaultrestclient.DefaultRestClient;
import org.ehrbase.serialisation.RMDataFormat;
import org.ehrbase.serialisation.flatencoding.FlatFormat;
import org.ehrbase.serialisation.flatencoding.FlatJasonProvider;
import org.ehrbase.serialisation.flatencoding.FlatJson;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.UUID;

public class demo {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static final String OPEN_EHR_URL = "http://localhost:8080/ehrbase/";

    public static void main(String[] args) throws URISyntaxException, ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        // uncomment to test all validation files
        //testAllFiles();

        // uncomment to check just one file + view content
        testSpecificFile("REAL_EXAMPLE_1_KBV_PR_MIO_ZAEB_Bundle.xml");
    }

    public static void testSpecificFile(String fileName) throws ParserConfigurationException, IOException, SAXException, URISyntaxException, XPathExpressionException {

        LOGGER.info("Testing file " + fileName);
        Document fhirBundle = readXml(fileName);

        DentalBonusBookletTemplateProvider templateProvider = new DentalBonusBookletTemplateProvider();
        DefaultRestClient client = new DefaultRestClient(new OpenEhrClientConfig(new URI(OPEN_EHR_URL)), templateProvider);
        UUID ehrID = createEHR(client);

        DentalBonusBookletComposition composition = DentalBonusBookletMapper.openEHRMapper(fhirBundle, ehrID);

        //canonicalJsonComposition(composition);
        flatJsonComposition(composition);

        DentalBonusBookletComposition postReturned = saveComposition(client, ehrID, composition);
        LOGGER.info("POST: VersionUID: " + postReturned.getVersionUid());

        DentalBonusBookletComposition getReturned = getComposition(client, ehrID, postReturned.getVersionUid());
        LOGGER.info("GET: VersionUID: " + getReturned.getVersionUid());
        LOGGER.info(Objects.equals(postReturned.getVersionUid().toString(), getReturned.getVersionUid().toString()) + " -> Saved Composition for EHR_UID: " + ehrID);
    }

    public static void testAllFiles() throws ParserConfigurationException, IOException, SAXException, URISyntaxException, XPathExpressionException {
        for (int i = 1; i <= 14; i++) {
            String file = "REAL_EXAMPLE_" + i + "_KBV_PR_MIO_ZAEB_Bundle.xml";
            LOGGER.info(i + ". file");
            testSpecificFile(file);
        }
        LOGGER.info("ALL TEST FILES MAPPED SUCCESSFULLY");
    }

    public static Document readXml(String file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc =  builder.parse(new File("src/main/resources/"+file));
        return doc;
    }

    public static DentalBonusBookletComposition saveComposition(DefaultRestClient client, UUID ehr, DentalBonusBookletComposition composition) throws URISyntaxException {
        return client.compositionEndpoint(ehr).mergeCompositionEntity(composition);
    }

    public static DentalBonusBookletComposition getComposition(DefaultRestClient client, UUID ehr, VersionUid id) throws URISyntaxException {
        return client.compositionEndpoint(ehr).find(id.getUuid(), DentalBonusBookletComposition.class).orElse(new DentalBonusBookletComposition());
    }

    public static UUID createEHR(DefaultRestClient client) throws URISyntaxException {
        EhrEndpoint ehrEndpoint = client.ehrEndpoint();
        UUID ehr = ehrEndpoint.createEhr();
        return ehr;
    }

    public static void canonicalJsonComposition(DentalBonusBookletComposition comp) {

        // containts more information than flat JSON
        TemplateProvider provider = new DentalBonusBookletTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        RMObject rmobject = unflat.unflatten(comp);

        CanonicalJson json = new CanonicalJson();
        System.out.println(json.marshal(rmobject));
    }

    public static void flatJsonComposition(DentalBonusBookletComposition comp) {

        // better readable than canonical JSON
        TemplateProvider provider = new DentalBonusBookletTemplateProvider();
        Unflattener unflat = new Unflattener(provider);

        RMDataFormat flat = new FlatJasonProvider(provider).buildFlatJson(FlatFormat.SIM_SDT, "DentalBonusBooklet");
        RMObject rmobject = unflat.unflatten(comp);

        System.out.println(flat.marshal(rmobject));
    }

}
