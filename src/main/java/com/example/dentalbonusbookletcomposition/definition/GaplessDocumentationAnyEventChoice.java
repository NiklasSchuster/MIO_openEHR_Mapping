package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvEHRURI;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.377433500+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface GaplessDocumentationAnyEventChoice {
  NullFlavour getStatusNullFlavourDefiningCode();

  void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode);

  CodeDefiningCode getCodeDefiningCode();

  void setCodeDefiningCode(CodeDefiningCode codeDefiningCode);

  NullFlavour getCodeNullFlavourDefiningCode();

  void setCodeNullFlavourDefiningCode(NullFlavour codeNullFlavourDefiningCode);

  TemporalAccessor getValuedatetimeValue();

  void setValuedatetimeValue(TemporalAccessor valuedatetimeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getValuedatetimeNullFlavourDefiningCode();

  void setValuedatetimeNullFlavourDefiningCode(NullFlavour valuedatetimeNullFlavourDefiningCode);

  NullFlavour getDisclaimerNullFlavourDefiningCode();

  void setDisclaimerNullFlavourDefiningCode(NullFlavour disclaimerNullFlavourDefiningCode);

  String getTextValue();

  void setTextValue(String textValue);

  NullFlavour getTextNullFlavourDefiningCode();

  void setTextNullFlavourDefiningCode(NullFlavour textNullFlavourDefiningCode);

  NullFlavour getSubjectNullFlavourDefiningCode();

  void setSubjectNullFlavourDefiningCode(NullFlavour subjectNullFlavourDefiningCode);

  StatusDefiningCode getStatusDefiningCode();

  void setStatusDefiningCode(StatusDefiningCode statusDefiningCode);

  DisclaimerDefiningCode getDisclaimerDefiningCode();

  void setDisclaimerDefiningCode(DisclaimerDefiningCode disclaimerDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  DvEHRURI getSubject();

  void setSubject(DvEHRURI subject);
}
