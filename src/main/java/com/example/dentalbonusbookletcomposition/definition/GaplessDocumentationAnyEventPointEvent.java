package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvEHRURI;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.374431+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class GaplessDocumentationAnyEventPointEvent implements PointEventEntity, GaplessDocumentationAnyEventChoice {
  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/status
   */
  @Path("/data[at0003]/items[at0004]/value|defining_code")
  private StatusDefiningCode statusDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/status/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/subject
   */
  @Path("/data[at0003]/items[at0009]/value")
  private DvEHRURI subject;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/subject/null_flavour
   */
  @Path("/data[at0003]/items[at0009]/null_flavour|defining_code")
  private NullFlavour subjectNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/text
   */
  @Path("/data[at0003]/items[at0010]/value|value")
  private String textValue;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/text/null_flavour
   */
  @Path("/data[at0003]/items[at0010]/null_flavour|defining_code")
  private NullFlavour textNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/code
   */
  @Path("/data[at0003]/items[at0011]/value|defining_code")
  private CodeDefiningCode codeDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/code/null_flavour
   */
  @Path("/data[at0003]/items[at0011]/null_flavour|defining_code")
  private NullFlavour codeNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/disclaimer
   */
  @Path("/data[at0003]/items[at0012]/value|defining_code")
  private DisclaimerDefiningCode disclaimerDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/disclaimer/null_flavour
   */
  @Path("/data[at0003]/items[at0012]/null_flavour|defining_code")
  private NullFlavour disclaimerNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/valueDateTime
   */
  @Path("/data[at0003]/items[at0015]/value|value")
  private TemporalAccessor valuedatetimeValue;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/Tree/valueDateTime/null_flavour
   */
  @Path("/data[at0003]/items[at0015]/null_flavour|defining_code")
  private NullFlavour valuedatetimeNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setStatusDefiningCode(StatusDefiningCode statusDefiningCode) {
     this.statusDefiningCode = statusDefiningCode;
  }

  public StatusDefiningCode getStatusDefiningCode() {
     return this.statusDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
  }

  public void setSubject(DvEHRURI subject) {
     this.subject = subject;
  }

  public DvEHRURI getSubject() {
     return this.subject ;
  }

  public void setSubjectNullFlavourDefiningCode(NullFlavour subjectNullFlavourDefiningCode) {
     this.subjectNullFlavourDefiningCode = subjectNullFlavourDefiningCode;
  }

  public NullFlavour getSubjectNullFlavourDefiningCode() {
     return this.subjectNullFlavourDefiningCode ;
  }

  public void setTextValue(String textValue) {
     this.textValue = textValue;
  }

  public String getTextValue() {
     return this.textValue ;
  }

  public void setTextNullFlavourDefiningCode(NullFlavour textNullFlavourDefiningCode) {
     this.textNullFlavourDefiningCode = textNullFlavourDefiningCode;
  }

  public NullFlavour getTextNullFlavourDefiningCode() {
     return this.textNullFlavourDefiningCode ;
  }

  public void setCodeDefiningCode(CodeDefiningCode codeDefiningCode) {
     this.codeDefiningCode = codeDefiningCode;
  }

  public CodeDefiningCode getCodeDefiningCode() {
     return this.codeDefiningCode ;
  }

  public void setCodeNullFlavourDefiningCode(NullFlavour codeNullFlavourDefiningCode) {
     this.codeNullFlavourDefiningCode = codeNullFlavourDefiningCode;
  }

  public NullFlavour getCodeNullFlavourDefiningCode() {
     return this.codeNullFlavourDefiningCode ;
  }

  public void setDisclaimerDefiningCode(DisclaimerDefiningCode disclaimerDefiningCode) {
     this.disclaimerDefiningCode = disclaimerDefiningCode;
  }

  public DisclaimerDefiningCode getDisclaimerDefiningCode() {
     return this.disclaimerDefiningCode ;
  }

  public void setDisclaimerNullFlavourDefiningCode(NullFlavour disclaimerNullFlavourDefiningCode) {
     this.disclaimerNullFlavourDefiningCode = disclaimerNullFlavourDefiningCode;
  }

  public NullFlavour getDisclaimerNullFlavourDefiningCode() {
     return this.disclaimerNullFlavourDefiningCode ;
  }

  public void setValuedatetimeValue(TemporalAccessor valuedatetimeValue) {
     this.valuedatetimeValue = valuedatetimeValue;
  }

  public TemporalAccessor getValuedatetimeValue() {
     return this.valuedatetimeValue ;
  }

  public void setValuedatetimeNullFlavourDefiningCode(
      NullFlavour valuedatetimeNullFlavourDefiningCode) {
     this.valuedatetimeNullFlavourDefiningCode = valuedatetimeNullFlavourDefiningCode;
  }

  public NullFlavour getValuedatetimeNullFlavourDefiningCode() {
     return this.valuedatetimeNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
