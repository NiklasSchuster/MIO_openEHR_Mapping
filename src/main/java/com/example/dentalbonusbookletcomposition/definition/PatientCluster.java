package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.Temporal;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.person-patient.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.298041200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class PatientCluster implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Name
   * Description: The unstructured name for the individual.
   * Comment: The content of this data element may be derived from one or more components from CLUSTER.structured_name combined together as a text string. For example: 'John Markham', 'Professor Sir John Markham', 'John Markham Jnr MP'.
   */
  @Path("/items[at0001]/value|value")
  private String nameValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Name/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour nameNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Label
   * Description: A label for the individual.
   * Comment: For example: 'Neighbour in the house with the red door'.
   */
  @Path("/items[at0011]/value|value")
  private String labelValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Label/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour labelNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person
   * Description: Discrete components of an individual's name.
   */
  @Path("/items[openEHR-EHR-CLUSTER.structured_name.v1]")
  private StructuredNameOfAPersonCluster structuredNameOfAPerson;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Identifier
   * Description: Identifier associated with the individual.
   * Comment: Occurrences for this data element is set to 0..* to allow for more than one Identifier to be recorded. Note that the DV_IDENTIFIER data type contains multiple subcomponents for recording the ID value, type, issuer and assigned. For example - social security number; driver's license; or passport number.
   */
  @Path("/items[at0003]")
  private List<PatientIdentifierElement> identifier;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address
   * Description: Details about the location of a person, physical building or landmark.
   */
  @Path("/items[openEHR-EHR-CLUSTER.address.v1]")
  private AddressCluster address;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Electronic communication
   * Description: Details about one or more types of electronic communication for the individual.
   */
  @Path("/items[at0006]")
  private List<Cluster> electronicCommunication;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Organisation
   * Description: Details about the organisational context for the individual.
   * Comment: For example: identifying the business or community organisation associated with the 'Role' of the individual.
   */
  @Path("/items[at0007]")
  private List<Cluster> organisation;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Additional details
   * Description: Additional details about the individual.
   */
  @Path("/items[at0008]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Photo
   * Description: Photograph of the individual.
   */
  @Path("/items[at0009]")
  private List<Cluster> photo;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Comment
   * Description: Additional narrative about the individual not captured in other fields.
   */
  @Path("/items[at0010]/value|value")
  private String commentValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Comment/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/birthDate
   */
  @Path("/items[at0.1]/value|value")
  private Temporal birthdateValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/birthDate/null_flavour
   */
  @Path("/items[at0.1]/null_flavour|defining_code")
  private NullFlavour birthdateNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setNameValue(String nameValue) {
     this.nameValue = nameValue;
  }

  public String getNameValue() {
     return this.nameValue ;
  }

  public void setNameNullFlavourDefiningCode(NullFlavour nameNullFlavourDefiningCode) {
     this.nameNullFlavourDefiningCode = nameNullFlavourDefiningCode;
  }

  public NullFlavour getNameNullFlavourDefiningCode() {
     return this.nameNullFlavourDefiningCode ;
  }

  public void setLabelValue(String labelValue) {
     this.labelValue = labelValue;
  }

  public String getLabelValue() {
     return this.labelValue ;
  }

  public void setLabelNullFlavourDefiningCode(NullFlavour labelNullFlavourDefiningCode) {
     this.labelNullFlavourDefiningCode = labelNullFlavourDefiningCode;
  }

  public NullFlavour getLabelNullFlavourDefiningCode() {
     return this.labelNullFlavourDefiningCode ;
  }

  public void setStructuredNameOfAPerson(StructuredNameOfAPersonCluster structuredNameOfAPerson) {
     this.structuredNameOfAPerson = structuredNameOfAPerson;
  }

  public StructuredNameOfAPersonCluster getStructuredNameOfAPerson() {
     return this.structuredNameOfAPerson ;
  }

  public void setIdentifier(List<PatientIdentifierElement> identifier) {
     this.identifier = identifier;
  }

  public List<PatientIdentifierElement> getIdentifier() {
     return this.identifier ;
  }

  public void setAddress(AddressCluster address) {
     this.address = address;
  }

  public AddressCluster getAddress() {
     return this.address ;
  }

  public void setElectronicCommunication(List<Cluster> electronicCommunication) {
     this.electronicCommunication = electronicCommunication;
  }

  public List<Cluster> getElectronicCommunication() {
     return this.electronicCommunication ;
  }

  public void setOrganisation(List<Cluster> organisation) {
     this.organisation = organisation;
  }

  public List<Cluster> getOrganisation() {
     return this.organisation ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setPhoto(List<Cluster> photo) {
     this.photo = photo;
  }

  public List<Cluster> getPhoto() {
     return this.photo ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setBirthdateValue(Temporal birthdateValue) {
     this.birthdateValue = birthdateValue;
  }

  public Temporal getBirthdateValue() {
     return this.birthdateValue ;
  }

  public void setBirthdateNullFlavourDefiningCode(NullFlavour birthdateNullFlavourDefiningCode) {
     this.birthdateNullFlavourDefiningCode = birthdateNullFlavourDefiningCode;
  }

  public NullFlavour getBirthdateNullFlavourDefiningCode() {
     return this.birthdateNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
