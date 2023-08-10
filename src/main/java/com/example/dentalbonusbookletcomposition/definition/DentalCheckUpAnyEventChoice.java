package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvEHRURI;
import java.lang.Boolean;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.394814600+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface DentalCheckUpAnyEventChoice {
  DvEHRURI getSubject();

  void setSubject(DvEHRURI subject);

  CheckupDefiningCode getCheckupDefiningCode();

  void setCheckupDefiningCode(CheckupDefiningCode checkupDefiningCode);

  String getTextValue();

  void setTextValue(String textValue);

  NullFlavour getSubjectNullFlavourDefiningCode();

  void setSubjectNullFlavourDefiningCode(NullFlavour subjectNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Boolean isValuebooleanValue();

  void setValuebooleanValue(Boolean valuebooleanValue);

  StatusDefiningCode getStatusDefiningCode();

  void setStatusDefiningCode(StatusDefiningCode statusDefiningCode);

  NullFlavour getValuebooleanNullFlavourDefiningCode();

  void setValuebooleanNullFlavourDefiningCode(NullFlavour valuebooleanNullFlavourDefiningCode);

  NullFlavour getStatusNullFlavourDefiningCode();

  void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode);

  NullFlavour getCheckupNullFlavourDefiningCode();

  void setCheckupNullFlavourDefiningCode(NullFlavour checkupNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getTextNullFlavourDefiningCode();

  void setTextNullFlavourDefiningCode(NullFlavour textNullFlavourDefiningCode);
}
