package com.example.dentalbonusbookletcomposition;

import org.apache.xmlbeans.XmlException;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class DentalBonusBookletTemplateProvider implements TemplateProvider {

    public Optional<OPERATIONALTEMPLATE> find(String templateId){
        InputStream stream = getClass().getResourceAsStream("/DentalBonusBooklet.opt");
        try {
            TemplateDocument template = TemplateDocument.Factory.parse(stream);
            return Optional.ofNullable(template.getTemplate());
        } catch (XmlException | IOException e){
            System.out.println("Error happened");
            return Optional.ofNullable(null);
        }
    }
}
