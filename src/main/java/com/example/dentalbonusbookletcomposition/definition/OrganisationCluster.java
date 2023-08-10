package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.organisation.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.343434200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class OrganisationCluster implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Name
   * Description: The unstructured name or label for the organisation.
   * Comment: For example: 'Royal Children's Hospital'; 'ABC District Nursing Service'; 'YNWA Oslo' or 'JB Smith Lawyers'.
   */
  @Path("/items[at0001]/value|value")
  private String nameValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Name/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour nameNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Identifier/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour identifierNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Address
   * Description: Details about the location of a person, physical building or landmark.
   */
  @Path("/items[openEHR-EHR-CLUSTER.address.v1]")
  private AddressCluster2 address;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication
   * Description: Details about a specified type of electronic communication.
   */
  @Path("/items[openEHR-EHR-CLUSTER.electronic_communication-dental_booklet.v1]")
  private List<ElectronicCommunicationCluster> electronicCommunication;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Contact person
   * Description: Details about one or more people within the organisation.
   */
  @Path("/items[at0002]")
  private List<Cluster> contactPerson;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Parent organisation
   * Description: A larger organisation of which this organisation is a child or subsidiary.
   */
  @Path("/items[at0021]")
  private List<Cluster> parentOrganisation;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Additional details
   * Description: Additional details about the organisation.
   */
  @Path("/items[at0017]")
  private List<Cluster> additionalDetails;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Comment
   * Description: Additional narrative about the organisation not captured in other fields.
   */
  @Path("/items[at0019]/value|value")
  private String commentValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Comment/null_flavour
   */
  @Path("/items[at0019]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Identifier
   * Description: Identifier associated with the organisation.
   * Comment: Occurrences for this data element is set to 0..* to allow for more than one Identifier to be recorded. Note that the ID data type contains multiple subcomponents for recording the ID value, type, issuer and assigner.
   */
  @Path("/items[at0003]/value")
  @Choice
  private OrganisationIdentifierChoice identifier;

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

  public void setIdentifierNullFlavourDefiningCode(NullFlavour identifierNullFlavourDefiningCode) {
     this.identifierNullFlavourDefiningCode = identifierNullFlavourDefiningCode;
  }

  public NullFlavour getIdentifierNullFlavourDefiningCode() {
     return this.identifierNullFlavourDefiningCode ;
  }

  public void setAddress(AddressCluster2 address) {
     this.address = address;
  }

  public AddressCluster2 getAddress() {
     return this.address ;
  }

  public void setElectronicCommunication(
      List<ElectronicCommunicationCluster> electronicCommunication) {
     this.electronicCommunication = electronicCommunication;
  }

  public List<ElectronicCommunicationCluster> getElectronicCommunication() {
     return this.electronicCommunication ;
  }

  public void setContactPerson(List<Cluster> contactPerson) {
     this.contactPerson = contactPerson;
  }

  public List<Cluster> getContactPerson() {
     return this.contactPerson ;
  }

  public void setParentOrganisation(List<Cluster> parentOrganisation) {
     this.parentOrganisation = parentOrganisation;
  }

  public List<Cluster> getParentOrganisation() {
     return this.parentOrganisation ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
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

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setIdentifier(OrganisationIdentifierChoice identifier) {
     this.identifier = identifier;
  }

  public OrganisationIdentifierChoice getIdentifier() {
     return this.identifier ;
  }
}
