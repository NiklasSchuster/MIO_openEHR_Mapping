package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvEHRURI;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.389007500+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class DentalCheckUpAnyEventIntervalEvent implements IntervalEventEntity, DentalCheckUpAnyEventChoice {
  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/status
   */
  @Path("/data[at0003]/items[at0004]/value|defining_code")
  private StatusDefiningCode statusDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/Tree/status/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/valueBoolean
   */
  @Path("/data[at0003]/items[at0010]/value|value")
  private Boolean valuebooleanValue;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/Tree/valueBoolean/null_flavour
   */
  @Path("/data[at0003]/items[at0010]/null_flavour|defining_code")
  private NullFlavour valuebooleanNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/subject
   */
  @Path("/data[at0003]/items[at0011]/value")
  private DvEHRURI subject;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/Tree/subject/null_flavour
   */
  @Path("/data[at0003]/items[at0011]/null_flavour|defining_code")
  private NullFlavour subjectNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/checkup
   */
  @Path("/data[at0003]/items[at0013]/value|defining_code")
  private CheckupDefiningCode checkupDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/Tree/checkup/null_flavour
   */
  @Path("/data[at0003]/items[at0013]/null_flavour|defining_code")
  private NullFlavour checkupNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/text
   */
  @Path("/data[at0003]/items[at0016]/value|value")
  private String textValue;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/Tree/text/null_flavour
   */
  @Path("/data[at0003]/items[at0016]/null_flavour|defining_code")
  private NullFlavour textNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

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

  public void setValuebooleanValue(Boolean valuebooleanValue) {
     this.valuebooleanValue = valuebooleanValue;
  }

  public Boolean isValuebooleanValue() {
     return this.valuebooleanValue ;
  }

  public void setValuebooleanNullFlavourDefiningCode(
      NullFlavour valuebooleanNullFlavourDefiningCode) {
     this.valuebooleanNullFlavourDefiningCode = valuebooleanNullFlavourDefiningCode;
  }

  public NullFlavour getValuebooleanNullFlavourDefiningCode() {
     return this.valuebooleanNullFlavourDefiningCode ;
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

  public void setCheckupDefiningCode(CheckupDefiningCode checkupDefiningCode) {
     this.checkupDefiningCode = checkupDefiningCode;
  }

  public CheckupDefiningCode getCheckupDefiningCode() {
     return this.checkupDefiningCode ;
  }

  public void setCheckupNullFlavourDefiningCode(NullFlavour checkupNullFlavourDefiningCode) {
     this.checkupNullFlavourDefiningCode = checkupNullFlavourDefiningCode;
  }

  public NullFlavour getCheckupNullFlavourDefiningCode() {
     return this.checkupNullFlavourDefiningCode ;
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

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
