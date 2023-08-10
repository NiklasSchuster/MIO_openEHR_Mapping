package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.structured_name.v1")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.303042700+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class StructuredNameOfAPersonCluster implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person/Prefix
   * Description: One or more honorific form(s) of address commencing a name.
   * Comment: Occurrences for this data element are set to 0..* to allow for more than one Title to be recorded. Coding with an external terminology is preferred, where possible. For example: 'Doctor'; 'Ms'; 'Mx'; or 'Professor Dr'.
   */
  @Path("/items[at0001 and name/value='Prefix']/value|value")
  private String prefixValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Structured name of a person/Prefix/null_flavour
   */
  @Path("/items[at0001 and name/value='Prefix']/null_flavour|defining_code")
  private NullFlavour prefixNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person/Given name
   * Description: One or more unique name(s) used to identify an individual within a family group.
   * Comment: Occurrences for this data element are set to 0..* to allow for more than one Given name to be recorded. In addition, this data element may be cloned and renamed within a template to allow discrete recording of different types of Given name - for example 'First name', 'Middle name', 'Preferred name' or 'Nickname', as required for a specific use case.
   */
  @Path("/items[at0002]/value|value")
  private String givenNameValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Structured name of a person/Given name/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour givenNameNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person/Family name
   * Description: One or more name(s) that an individual has in common with a family group.
   * Comment: Also known as 'Last name' or 'Surname'. Occurrences for this data element are set to 0..* to allow for more than one Family name to be recorded. Complex names such as 'El Haddad' or 'van der Heyden' can be recorded using this naming pattern, as identified in ISO 22220 (Annex F), but for the intended use case for this archetype it is most likely that the full family name will be recorded as a string.
   */
  @Path("/items[at0005]/value|value")
  private String familyNameValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Structured name of a person/Family name/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour familyNameNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person/Suffix
   * Description: One or more term(s) placed after all other name components, usually to differentiate an individual from a family member with identical Given and Family name components.
   * Comment: Occurrences for this data element are set to 0..* to allow for more than one Suffix to be recorded. Coding with an external terminology is preferred, where possible. For example: 'Junior (Jr)'; 'Senior (Sr)'; 'Second (II)'.
   */
  @Path("/items[at0006]/value|value")
  private String suffixValue;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Patient/Structured name of a person/Suffix/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour suffixNullFlavourDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient/Structured name of a person/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setPrefixValue(String prefixValue) {
     this.prefixValue = prefixValue;
  }

  public String getPrefixValue() {
     return this.prefixValue ;
  }

  public void setPrefixNullFlavourDefiningCode(NullFlavour prefixNullFlavourDefiningCode) {
     this.prefixNullFlavourDefiningCode = prefixNullFlavourDefiningCode;
  }

  public NullFlavour getPrefixNullFlavourDefiningCode() {
     return this.prefixNullFlavourDefiningCode ;
  }

  public void setGivenNameValue(String givenNameValue) {
     this.givenNameValue = givenNameValue;
  }

  public String getGivenNameValue() {
     return this.givenNameValue ;
  }

  public void setGivenNameNullFlavourDefiningCode(NullFlavour givenNameNullFlavourDefiningCode) {
     this.givenNameNullFlavourDefiningCode = givenNameNullFlavourDefiningCode;
  }

  public NullFlavour getGivenNameNullFlavourDefiningCode() {
     return this.givenNameNullFlavourDefiningCode ;
  }

  public void setFamilyNameValue(String familyNameValue) {
     this.familyNameValue = familyNameValue;
  }

  public String getFamilyNameValue() {
     return this.familyNameValue ;
  }

  public void setFamilyNameNullFlavourDefiningCode(NullFlavour familyNameNullFlavourDefiningCode) {
     this.familyNameNullFlavourDefiningCode = familyNameNullFlavourDefiningCode;
  }

  public NullFlavour getFamilyNameNullFlavourDefiningCode() {
     return this.familyNameNullFlavourDefiningCode ;
  }

  public void setSuffixValue(String suffixValue) {
     this.suffixValue = suffixValue;
  }

  public String getSuffixValue() {
     return this.suffixValue ;
  }

  public void setSuffixNullFlavourDefiningCode(NullFlavour suffixNullFlavourDefiningCode) {
     this.suffixNullFlavourDefiningCode = suffixNullFlavourDefiningCode;
  }

  public NullFlavour getSuffixNullFlavourDefiningCode() {
     return this.suffixNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
