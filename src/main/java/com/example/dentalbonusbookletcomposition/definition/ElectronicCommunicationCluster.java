package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.electronic_communication-dental_booklet.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.353433600+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ElectronicCommunicationCluster implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication/Type
   * Description: The type or form of electronic communication.
   * Comment: The DV_CODED_TEXT value set supports recording of the most common electronic communications used in health. If other alternatives are required the DV_TEXT data type can be used to record other types of electronic communication such as social media or video conferencing URLs within a template.
   */
  @Path("/items[at0001.1]/value|defining_code")
  private TypeDefiningCode2 typeDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Electronic communication/Type/null_flavour
   */
  @Path("/items[at0001.1]/null_flavour|defining_code")
  private NullFlavour typeNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Electronic communication/Value/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour valueNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication/Additional details
   * Description: Additional details about the electronic communication.
   */
  @Path("/items[at0013]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication/Value
   * Description: The unique combination of alphanumeric characters, relevant for representation of 'Type'.
   * Comment: For example: area code + landline phone/pager number; country code + mobile phone number; or email address.
   */
  @Path("/items[at0002]/value")
  @Choice
  private ElectronicCommunicationValueChoice value;

  public void setTypeDefiningCode(TypeDefiningCode2 typeDefiningCode) {
     this.typeDefiningCode = typeDefiningCode;
  }

  public TypeDefiningCode2 getTypeDefiningCode() {
     return this.typeDefiningCode ;
  }

  public void setTypeNullFlavourDefiningCode(NullFlavour typeNullFlavourDefiningCode) {
     this.typeNullFlavourDefiningCode = typeNullFlavourDefiningCode;
  }

  public NullFlavour getTypeNullFlavourDefiningCode() {
     return this.typeNullFlavourDefiningCode ;
  }

  public void setValueNullFlavourDefiningCode(NullFlavour valueNullFlavourDefiningCode) {
     this.valueNullFlavourDefiningCode = valueNullFlavourDefiningCode;
  }

  public NullFlavour getValueNullFlavourDefiningCode() {
     return this.valueNullFlavourDefiningCode ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setValue(ElectronicCommunicationValueChoice value) {
     this.value = value;
  }

  public ElectronicCommunicationValueChoice getValue() {
     return this.value ;
  }
}
