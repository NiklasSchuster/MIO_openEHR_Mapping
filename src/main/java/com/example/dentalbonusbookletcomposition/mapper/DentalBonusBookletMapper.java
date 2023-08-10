package com.example.dentalbonusbookletcomposition.mapper;

import com.example.dentalbonusbookletcomposition.DentalBonusBookletComposition;
import com.example.dentalbonusbookletcomposition.definition.AddressAddressLineElement;
import com.example.dentalbonusbookletcomposition.definition.AddressAddressLineElement2;
import com.example.dentalbonusbookletcomposition.definition.AddressCluster;
import com.example.dentalbonusbookletcomposition.definition.AddressCluster2;
import com.example.dentalbonusbookletcomposition.definition.AddressDistrictCountyElement;
import com.example.dentalbonusbookletcomposition.definition.AddressTownElement;
import com.example.dentalbonusbookletcomposition.definition.AddressTypeDvCodedText;
import com.example.dentalbonusbookletcomposition.definition.AddressUseDvCodedText;
import com.example.dentalbonusbookletcomposition.definition.CheckupDefiningCode;
import com.example.dentalbonusbookletcomposition.definition.CodeDefiningCode;
import com.example.dentalbonusbookletcomposition.definition.DentalCheckUpAnyEventPointEvent;
import com.example.dentalbonusbookletcomposition.definition.DentalCheckUpObservation;
import com.example.dentalbonusbookletcomposition.definition.DisclaimerDefiningCode;
import com.example.dentalbonusbookletcomposition.definition.ElectronicCommunicationCluster;
import com.example.dentalbonusbookletcomposition.definition.ElectronicCommunicationValueDvText;
import com.example.dentalbonusbookletcomposition.definition.GaplessDocumentationAnyEventPointEvent;
import com.example.dentalbonusbookletcomposition.definition.GaplessDocumentationObservation;
import com.example.dentalbonusbookletcomposition.definition.OrganisationCluster;
import com.example.dentalbonusbookletcomposition.definition.OrganisationIdentifierDvIdentifier;
import com.example.dentalbonusbookletcomposition.definition.PatientCluster;
import com.example.dentalbonusbookletcomposition.definition.PatientIdentifierDvIdentifier;
import com.example.dentalbonusbookletcomposition.definition.PatientIdentifierElement;
import com.example.dentalbonusbookletcomposition.definition.StatusDefiningCode;
import com.example.dentalbonusbookletcomposition.definition.StructuredNameOfAPersonCluster;
import com.example.dentalbonusbookletcomposition.definition.TypeDefiningCode;
import com.example.dentalbonusbookletcomposition.definition.TypeDefiningCode2;
import com.example.dentalbonusbookletcomposition.definition.UseDefiningCode;
import com.nedap.archie.rm.datavalues.DvEHRURI;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartySelf;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;
import java.util.UUID;

public class DentalBonusBookletMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public static XPath xpath = XPathFactory.newInstance().newXPath();
    public static Document fhirBundle;
    public static UUID ehrId;

    public static DentalBonusBookletComposition openEHRMapper(Document bundleToMap, UUID ehrID) throws XPathExpressionException {

        fhirBundle = bundleToMap;
        ehrId = ehrID;

        DentalBonusBookletComposition composition = new DentalBonusBookletComposition();

        mapMetaInfo(composition);
        mapPatient(composition);
        mapOrganization(composition);
        mapDentalCheckUp(composition);
        mapGaplessDocumentation(composition);

        LOGGER.info("Finished mapping");
        return composition;
    }

    public static void mapMetaInfo(DentalBonusBookletComposition composition) throws XPathExpressionException {

        composition.setLanguage(Language.EN);
        composition.setComposer(new PartyIdentified(null, execQuery(xpath.compile("//Organization/name/@value")), null));
        composition.setStartTimeValue(execQueryDateTime(xpath.compile("//Composition/date/@value")));
        composition.setSettingDefiningCode(Setting.DENTAL_CARE);
        composition.setTerritory(Territory.DE);
        composition.setHealthCareFacility(new PartyIdentified(null, execQuery(xpath.compile("//Organization/name/@value")), null));
        composition.setCategoryDefiningCode(Category.EVENT);

        LOGGER.info("Mapped Meta Information");
    }

    public static void mapPatient(DentalBonusBookletComposition composition) throws XPathExpressionException {

        PatientCluster patient = new PatientCluster();

        // identifier
        PatientIdentifierElement personIdentifierElement = new PatientIdentifierElement();
        PatientIdentifierDvIdentifier personIdentifierDvIdentifier = new PatientIdentifierDvIdentifier();
        DvIdentifier dvIdentifier = new DvIdentifier();
        dvIdentifier.setIssuer(execQuery(xpath.compile("//Patient/identifier/type/coding/code/@value")));
        dvIdentifier.setId(execQuery(xpath.compile("//Patient/identifier/value/@value")));
        personIdentifierDvIdentifier.setIdentifier(dvIdentifier);
        personIdentifierElement.setValue2(personIdentifierDvIdentifier);

        patient.setIdentifier(Collections.singletonList(personIdentifierElement));

        // set Name
        StructuredNameOfAPersonCluster structuredName = new StructuredNameOfAPersonCluster();
        String givenName = execQuery(xpath.compile("//Patient/name/given/@value"));
        structuredName.setGivenNameValue(givenName);

        String suffix = execQuery(xpath.compile("//Patient/name/family/extension[@url=\"http://fhir.de/StructureDefinition/humanname-namenszusatz\"]/valueString/@value"));
        String own_prefix = execQuery(xpath.compile("//Patient/name/family/extension[@url=\"http://hl7.org/fhir/StructureDefinition/humanname-own-prefix\"]/valueString/@value"));
        String own_name = execQuery(xpath.compile("//Patient/name/family/extension[@url=\"http://hl7.org/fhir/StructureDefinition/humanname-own-name\"]/valueString/@value"));
        String concatenated_family_name = (suffix == null ? "" : suffix+" ")+(own_prefix == null ? "" : own_prefix+" ")+own_name;
        structuredName.setFamilyNameValue(concatenated_family_name);

        String prefix = execQuery(xpath.compile("//Patient/name/prefix/@value"));
        structuredName.setPrefixValue(prefix);

        patient.setStructuredNameOfAPerson(structuredName);
        String concatenated_total_name = (prefix == null ? "" : prefix+" ")+(suffix == null ? "" : suffix+" ")+givenName+" "+(own_prefix == null ? "" : own_prefix+" ")+own_name;

        patient.setNameValue(concatenated_total_name);

        // comment
        patient.setCommentValue(execQueryText(xpath.compile("//Patient/text/div/p/text()")));

        // set address
        AddressCluster address = new AddressCluster();

        AddressUseDvCodedText addressUseDvCodedText = new AddressUseDvCodedText();
        String addressUse = execQuery(xpath.compile("//Patient/address/use/@value"));
        if(addressUse != null) {
            switch (addressUse.toUpperCase()) {
                case "HOME":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.RESIDENTIAL);
                    break;
                case "WORK":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.BUSINESS);
                    break;
                case "TEMP":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.TEMPORARY_ACCOMMODATION);
                    break;
            }
        }
        address.setUse(addressUseDvCodedText);

        AddressTypeDvCodedText addressTypeDvCodedText = new AddressTypeDvCodedText();
        String addressType = execQuery(xpath.compile("//Patient/address/type/@value"));
        addressTypeDvCodedText.setTypeDefiningCode(TypeDefiningCode.valueOf(addressType.toUpperCase()));
        address.setType(addressTypeDvCodedText);

        String districtCountry = execQuery(xpath.compile("//Patient/address/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-precinct\"]/valueString/@value"));
        address.setDistrictCountyValue(districtCountry);

        String town = execQuery(xpath.compile("//Patient/address/city/@value"));
        address.setTownValue(town);

        String country = execQuery(xpath.compile("//Patient/address/country/@value"));
        address.setCountryValue(country);

        String postalCode = execQuery(xpath.compile("//Patient/address/postalCode/@value"));
        address.setPostalCodeValue(postalCode);

        AddressAddressLineElement addressLineElement = new AddressAddressLineElement();
        String streetName = execQuery(xpath.compile("//Patient/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-streetName\"]/valueString/@value"));
        String houseNumber = execQuery(xpath.compile("//Patient/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-houseNumber\"]/valueString/@value"));
        String additionalLocator = execQuery(xpath.compile("//Patient/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-additionalLocator\"]/valueString/@value"));
        String concatenated_address_line = (streetName == null ? "" : streetName+" ")+(houseNumber == null ? "" : houseNumber+" ")+(additionalLocator == null ? "" : additionalLocator+" ");
        addressLineElement.setValue(concatenated_address_line);
        address.setAddressLine(Collections.singletonList(addressLineElement));

        patient.setAddress(address);

        // set birthday
        patient.setBirthdateValue(execQueryDate(xpath.compile("//Patient/birthDate/@value")));

        composition.setPatient(patient);

        LOGGER.info("Mapped Patient");
    }

    public static void mapOrganization(DentalBonusBookletComposition composition) throws XPathExpressionException {

        OrganisationCluster organisation = new OrganisationCluster();

        // comment
        organisation.setCommentValue(execQueryText(xpath.compile("//Organization/text/div/p/text()")));

        // identifier
        OrganisationIdentifierDvIdentifier organisationDvIdentifier = new OrganisationIdentifierDvIdentifier();
        DvIdentifier dvIdentifier = new DvIdentifier();
        dvIdentifier.setIssuer(execQuery(xpath.compile("//Organization/identifier/type/coding/code/@value")));
        dvIdentifier.setId(execQuery(xpath.compile("//Organization/identifier/value/@value")));
        organisationDvIdentifier.setIdentifier(dvIdentifier);

        organisation.setIdentifier(organisationDvIdentifier);

        // name
        organisation.setNameValue(execQuery(xpath.compile("//Organization/name/@value")));

        // address
        AddressCluster2 address = new AddressCluster2();

        AddressUseDvCodedText addressUseDvCodedText = new AddressUseDvCodedText();
        String addressUse = execQuery(xpath.compile("//Patient/address/use/@value"));
        if(addressUse != null) {
            switch (addressUse.toUpperCase()) {
                case "HOME":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.RESIDENTIAL);
                    break;
                case "WORK":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.BUSINESS);
                    break;
                case "TEMP":
                    addressUseDvCodedText.setUseDefiningCode(UseDefiningCode.TEMPORARY_ACCOMMODATION);
                    break;
            }
        }
        address.setUse(addressUseDvCodedText);

        AddressTypeDvCodedText addressTypeDvCodedText = new AddressTypeDvCodedText();
        String addressType = execQuery(xpath.compile("//Organization/address/type/@value"));
        addressTypeDvCodedText.setTypeDefiningCode(TypeDefiningCode.valueOf(addressType.toUpperCase()));
        address.setType(addressTypeDvCodedText);

        AddressDistrictCountyElement districtCountyElement = new AddressDistrictCountyElement();
        String districtCountry = execQuery(xpath.compile("//Organization/address/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-precinct\"]/valueString/@value"));
        districtCountyElement.setValue(districtCountry);
        address.setDistrictCounty(Collections.singletonList(districtCountyElement));

        AddressTownElement townElement = new AddressTownElement();
        String town = execQuery(xpath.compile("//Organization/address/city/@value"));
        townElement.setValue(town);
        address.setTown(Collections.singletonList(townElement));

        String country = execQuery(xpath.compile("//Organization/address/country/@value"));
        address.setCountryValue(country);

        String postalCode = execQuery(xpath.compile("//Organization/address/postalCode/@value"));
        address.setPostalCodeValue(postalCode);

        AddressAddressLineElement2 addressLineElement = new AddressAddressLineElement2();
        String streetName = execQuery(xpath.compile("//Organization/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-streetName\"]/valueString/@value"));
        String houseNumber = execQuery(xpath.compile("//Organization/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-houseNumber\"]/valueString/@value"));
        String additionalLocator = execQuery(xpath.compile("//Organization/address/line/extension[@url=\"http://hl7.org/fhir/StructureDefinition/iso21090-ADXP-additionalLocator\"]/valueString/@value"));
        String concatenated_address_line = (streetName == null ? "" : streetName+" ")+(houseNumber == null ? "" : houseNumber+" ")+(additionalLocator == null ? "" : additionalLocator+" ");
        addressLineElement.setValue(concatenated_address_line);
        address.setCommentValue(execQuery(xpath.compile("//Organization/address/text/@value")));
        address.setAddressLine(Collections.singletonList(addressLineElement));

        String concatenated_address = concatenated_address_line+", "+postalCode+" "+town+", "+country;
        address.setCommentValue(concatenated_address);

        organisation.setAddress(address);

        // telecom
        ElectronicCommunicationCluster communicationCluster = new ElectronicCommunicationCluster();

        ElectronicCommunicationValueDvText communicationValue = new ElectronicCommunicationValueDvText();
        communicationValue.setValueValue(execQuery(xpath.compile("//Organization/telecom/value/@value")));

        String communicationTypeString = execQuery(xpath.compile("//Organization/telecom/system/@value"));
        if(communicationTypeString != null) {
            switch (communicationTypeString.toUpperCase()) {
                case "FAX":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.FAX);
                    break;
                case "EMAIL":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.EMAIL);
                    break;
                case "PAGER":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.PAGER);
                    break;
                case "PHONE":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.TELEPHONE_EXCLUDING_MOBILE_TELEPHONE);
                    break;
                case "SMS":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.MOBILE_CELLULAR_TELEPHONE);
                    break;
                case "URL":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.URL);
                    break;
                case "OTHER":
                    communicationCluster.setTypeDefiningCode(TypeDefiningCode2.OTHER);
                    break;
            }
        }
        communicationCluster.setValue(communicationValue);

        organisation.setElectronicCommunication(Collections.singletonList(communicationCluster));

        composition.setOrganisation(organisation);

        LOGGER.info("Mapped Organization");
    }

    public static void mapDentalCheckUp(DentalBonusBookletComposition composition) throws XPathExpressionException {

        String dentalCheckFhirProfile = "https://fhir.kbv.de/StructureDefinition/KBV_PR_MIO_ZAEB_Observation_Dental_Check_Up|1.1.0";

        // check if resource exists
        String testString = execQuery(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/subject/reference/@value"));
        if(testString == null){
            LOGGER.info("Dental checkup does not exist");
            return;
        }

        DentalCheckUpObservation dentalCheckUp = new DentalCheckUpObservation();
        dentalCheckUp.setLanguage(Language.EN);
        dentalCheckUp.setSubject(new PartySelf());
        dentalCheckUp.setOriginValue(execQueryDate(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/effectiveDateTime/@value")));

        DentalCheckUpAnyEventPointEvent dentalCheckUpEvent = new DentalCheckUpAnyEventPointEvent();

        dentalCheckUpEvent.setTextValue(execQueryText(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/text/div/p/text()")));

        dentalCheckUpEvent.setTimeValue(execQueryDate(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/effectiveDateTime/@value")));

        DvEHRURI ehrUri = new DvEHRURI();
        ehrUri.setValue(URI.create("ehr:"+ehrId));
        dentalCheckUpEvent.setSubject(ehrUri);

        String dentalCheckType = execQuery(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/status/@value"));
        dentalCheckUpEvent.setStatusDefiningCode(StatusDefiningCode.valueOf(dentalCheckType.toUpperCase()));

        dentalCheckUpEvent.setValuebooleanValue(Boolean.valueOf(execQuery(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/valueBoolean/@value"))));

        String checkupCode = execQuery(xpath.compile("//Observation[meta/profile[@value='"+dentalCheckFhirProfile+"']]/code/coding/code/@value"));

        if(checkupCode != null) {
            switch (checkupCode) {
                case "63963009":
                    dentalCheckUpEvent.setCheckupDefiningCode(CheckupDefiningCode.DENTAL_PROPHYLAXIS_ADULT_PROCEDURE);
                    break;
                case "2115003":
                    dentalCheckUpEvent.setCheckupDefiningCode(CheckupDefiningCode.DENTAL_PROPHYLAXIS_CHILDREN_PROCEDURE);
                    break;
            }
        }

        dentalCheckUp.setAnyEvent(Collections.singletonList(dentalCheckUpEvent));

        composition.setDentalCheckUp(dentalCheckUp);

        LOGGER.info("Mapped DentalCheckUp");
    }

    public static void mapGaplessDocumentation(DentalBonusBookletComposition composition) throws XPathExpressionException {

        String gaplessDocFhirProfile = "https://fhir.kbv.de/StructureDefinition/KBV_PR_MIO_ZAEB_Observation_Gapless_Documentation|1.1.0";

        // check if resource exists
        String testString = execQuery(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/subject/reference/@value"));
        if(testString == null){
            LOGGER.info("Gapless documentation does not exist");
            return;
        }

        GaplessDocumentationObservation gaplessDocumentation = new GaplessDocumentationObservation();
        gaplessDocumentation.setLanguage(Language.EN);
        gaplessDocumentation.setSubject(new PartySelf());
        gaplessDocumentation.setOriginValue(execQueryDateTime(xpath.compile("//Composition/date/@value")));

        GaplessDocumentationAnyEventPointEvent gaplessDocumentationEvent = new GaplessDocumentationAnyEventPointEvent();

        gaplessDocumentationEvent.setTimeValue(execQueryDateTime(xpath.compile("//Composition/date/@value")));

        gaplessDocumentationEvent.setTextValue(execQueryText(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/text/div/p/text()")));

        DvEHRURI ehrUri = new DvEHRURI();
        ehrUri.setValue(URI.create("ehr:"+ehrId));
        gaplessDocumentationEvent.setSubject(ehrUri);

        String gapDocType = execQuery(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/status/@value"));
        gaplessDocumentationEvent.setStatusDefiningCode(StatusDefiningCode.valueOf(gapDocType.toUpperCase()));

        gaplessDocumentationEvent.setValuedatetimeValue(execQueryDate(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/valueDateTime/@value")));

        String codeCode = execQuery(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/code/text/@value"));
        if(codeCode.equals(CodeDefiningCode.DATUM_SEIT_DEM_EINE_LUECKENLOSE_DOKUMENTATION_IN_DEM_PAPIER_ZAHNBONUSHEFT_NACHWEISLICH_VORLIEGT.getValue()));{
            gaplessDocumentationEvent.setCodeDefiningCode(CodeDefiningCode.DATUM_SEIT_DEM_EINE_LUECKENLOSE_DOKUMENTATION_IN_DEM_PAPIER_ZAHNBONUSHEFT_NACHWEISLICH_VORLIEGT);
        }

        String disclaimer = execQuery(xpath.compile("//Observation[meta/profile[@value='"+gaplessDocFhirProfile+"']]/extension/valueString/@value"));
        if(disclaimer.equals(DisclaimerDefiningCode.DIE_VERTRAGSPARTEIEN_SIND_SICH_EINIG_DASS_DER_ZAHNARZT_IM_NACHHINEIN_FUER_EINE_FALSCHE_JAHRESANGABE_NICHT_HAFTBAR_GEMACHT_WERDEN_KANN_WENN_DIE_KRANKENKASSE_BEI_DER_PRUEFUNG_EINES_HEIL_UND_KOSTENPLANES_KEINEN_BONUS_ODER_EINE_ANDERE_BONUSSTUFE_FESTSTELLT.getValue()));
        {
            gaplessDocumentationEvent.setDisclaimerDefiningCode(DisclaimerDefiningCode.DIE_VERTRAGSPARTEIEN_SIND_SICH_EINIG_DASS_DER_ZAHNARZT_IM_NACHHINEIN_FUER_EINE_FALSCHE_JAHRESANGABE_NICHT_HAFTBAR_GEMACHT_WERDEN_KANN_WENN_DIE_KRANKENKASSE_BEI_DER_PRUEFUNG_EINES_HEIL_UND_KOSTENPLANES_KEINEN_BONUS_ODER_EINE_ANDERE_BONUSSTUFE_FESTSTELLT);
        }

        gaplessDocumentation.setAnyEvent(Collections.singletonList(gaplessDocumentationEvent));

        composition.setGaplessDocumentation(gaplessDocumentation);

        LOGGER.info("Mapped GaplessDocumentation");
    }

    public static String execQuery(XPathExpression expr) throws XPathExpressionException {
        // xpath callback: value="." -> remove value=" and ", keep only part in middle
        NodeList nl = (NodeList) expr.evaluate(fhirBundle, XPathConstants.NODESET);
        if (nl.item(0) == null) {
            return null;
        }
        String element = nl.item(0).toString().replaceFirst(".*=\"", "");
        element = element.substring(0, element.length() - 1);
        return element;
    }

    public static String execQueryText(XPathExpression expr) throws XPathExpressionException {
        // xpath callback: value="." -> remove value=" and ", keep only part in middle
        NodeList nl = (NodeList) expr.evaluate(fhirBundle, XPathConstants.NODESET);
        if (nl.item(0) == null) {
            return null;
        }
        String element = nl.item(0).toString().replaceFirst(".*text: ", "");
        element = element.substring(0, element.length() - 1);
        return element;
    }

    public static LocalDateTime execQueryDateTime(XPathExpression expr) throws XPathExpressionException {
        NodeList nl = (NodeList) expr.evaluate(fhirBundle, XPathConstants.NODESET);
        if (nl.item(0) == null) {
            return LocalDateTime.now();
        }
        String element = nl.item(0).toString().replaceFirst(".*=\"", "");
        element = element.substring(0, element.length() - 1);

        Instant instant = Instant.parse(element);
        LocalDateTime dateTime_converted = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        return dateTime_converted;
    }

    public static LocalDate execQueryDate(XPathExpression expr) throws XPathExpressionException {
        NodeList nl = (NodeList) expr.evaluate(fhirBundle, XPathConstants.NODESET);
        if (nl.item(0) == null) {
            return null;
        }
        String element = nl.item(0).toString().replaceFirst(".*=\"", "");
        element = element.substring(0, element.length() - 1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.GERMANY);
        LocalDate date = LocalDate.parse(element, dtf);

        return date;
    }

}
