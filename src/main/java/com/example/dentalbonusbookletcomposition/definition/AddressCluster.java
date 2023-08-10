package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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
@Archetype("openEHR-EHR-CLUSTER.address.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.322040500+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AddressCluster implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Address line
   * Description: An unstructured address line representing all relevant street-level or post-box details that would support the identification of a location.
   * Comment: Occurrences for this data element is set to 0..* to allow one or more free text 'Address line' data elements to represent the huge variety of ways that ‘street-level' details may need to be recorded within the context of a specified 'Town'. Multiple address lines can be represented in a template, renamed as 'Address line 1', 'Address line 2,' etc. For example: '7A/52 Davis Street' or 'Apartment 7A' as Address line 1 with '52 Davis Street' as Address line 2; a roadside mail box location, such as 'RMB 725, Princes Highway'; or using a descriptive landmark, such as or 'Corner of Smith & Brown Streets' or 'Second house north of the general store with the red door'.
   */
  @Path("/items[at0001]")
  private List<AddressAddressLineElement> addressLine;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Town
   * Description: The name of the suburb, town, city, village, community or lowest level locality that contains the address.
   * Comment: Coding with an external terminology is preferred, where possible. For example: 'Fitzroy'; 'Manchester'; 'Kingston' or 'Bergen'.
   */
  @Path("/items[at0002]/value|value")
  private String townValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Town/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour townNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/District/County
   * Description: The name of a local government district or geographical area that contains the address.
   * Comment: Coding with an external terminology is preferred, where possible. For example: 'Surf Coast' and 'Yarra' local government councils in Victoria, Australia;and the Parishes of 'Saint Andrew' and 'Kingston' in Jamaica..
   */
  @Path("/items[at0003]/value|value")
  private String districtCountyValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/District/County/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour districtCountyNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Postal code
   * Description: The code for a postal delivery area containing the address, as defined by the relevant postal delivery service.
   * Comment: Also known as a postcode or ZIP code.
   */
  @Path("/items[at0005]/value|value")
  private String postalCodeValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Postal code/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour postalCodeNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Country
   * Description: The name of the country containing the address.
   * Comment: For example: Australia; Canada; Jamaica; or Norway. Coding with an external terminology, such as EN ISO 3166–1 Alpha 2 country code, is recommended.
   */
  @Path("/items[at0006]/value|value")
  private String countryValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Country/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour countryNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Type/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour typeNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Use/null_flavour
   */
  @Path("/items[at0014]/null_flavour|defining_code")
  private NullFlavour useNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Comment
   * Description: Additional narrative about the address not captured in other fields.
   */
  @Path("/items[at0018]/value|value")
  private String commentValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Address/Comment/null_flavour
   */
  @Path("/items[at0018]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Type
   * Description: The type of address.
   * Comment: For example: physical or postal.
   */
  @Path("/items[at0010]/value")
  @Choice
  private AddressTypeChoice type;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Use
   * Description: The primary purpose or use for the address.
   */
  @Path("/items[at0014]/value")
  @Choice
  private AddressUseChoice use;

  public void setAddressLine(List<AddressAddressLineElement> addressLine) {
     this.addressLine = addressLine;
  }

  public List<AddressAddressLineElement> getAddressLine() {
     return this.addressLine ;
  }

  public void setTownValue(String townValue) {
     this.townValue = townValue;
  }

  public String getTownValue() {
     return this.townValue ;
  }

  public void setTownNullFlavourDefiningCode(NullFlavour townNullFlavourDefiningCode) {
     this.townNullFlavourDefiningCode = townNullFlavourDefiningCode;
  }

  public NullFlavour getTownNullFlavourDefiningCode() {
     return this.townNullFlavourDefiningCode ;
  }

  public void setDistrictCountyValue(String districtCountyValue) {
     this.districtCountyValue = districtCountyValue;
  }

  public String getDistrictCountyValue() {
     return this.districtCountyValue ;
  }

  public void setDistrictCountyNullFlavourDefiningCode(
      NullFlavour districtCountyNullFlavourDefiningCode) {
     this.districtCountyNullFlavourDefiningCode = districtCountyNullFlavourDefiningCode;
  }

  public NullFlavour getDistrictCountyNullFlavourDefiningCode() {
     return this.districtCountyNullFlavourDefiningCode ;
  }

  public void setPostalCodeValue(String postalCodeValue) {
     this.postalCodeValue = postalCodeValue;
  }

  public String getPostalCodeValue() {
     return this.postalCodeValue ;
  }

  public void setPostalCodeNullFlavourDefiningCode(NullFlavour postalCodeNullFlavourDefiningCode) {
     this.postalCodeNullFlavourDefiningCode = postalCodeNullFlavourDefiningCode;
  }

  public NullFlavour getPostalCodeNullFlavourDefiningCode() {
     return this.postalCodeNullFlavourDefiningCode ;
  }

  public void setCountryValue(String countryValue) {
     this.countryValue = countryValue;
  }

  public String getCountryValue() {
     return this.countryValue ;
  }

  public void setCountryNullFlavourDefiningCode(NullFlavour countryNullFlavourDefiningCode) {
     this.countryNullFlavourDefiningCode = countryNullFlavourDefiningCode;
  }

  public NullFlavour getCountryNullFlavourDefiningCode() {
     return this.countryNullFlavourDefiningCode ;
  }

  public void setTypeNullFlavourDefiningCode(NullFlavour typeNullFlavourDefiningCode) {
     this.typeNullFlavourDefiningCode = typeNullFlavourDefiningCode;
  }

  public NullFlavour getTypeNullFlavourDefiningCode() {
     return this.typeNullFlavourDefiningCode ;
  }

  public void setUseNullFlavourDefiningCode(NullFlavour useNullFlavourDefiningCode) {
     this.useNullFlavourDefiningCode = useNullFlavourDefiningCode;
  }

  public NullFlavour getUseNullFlavourDefiningCode() {
     return this.useNullFlavourDefiningCode ;
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

  public void setType(AddressTypeChoice type) {
     this.type = type;
  }

  public AddressTypeChoice getType() {
     return this.type ;
  }

  public void setUse(AddressUseChoice use) {
     this.use = use;
  }

  public AddressUseChoice getUse() {
     return this.use ;
  }
}
