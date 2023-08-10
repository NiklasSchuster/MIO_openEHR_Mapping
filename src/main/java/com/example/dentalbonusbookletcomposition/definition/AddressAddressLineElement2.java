package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.346432200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AddressAddressLineElement2 implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Address/Address line
   * Description: An unstructured address line representing all relevant street-level or post-box details that would support the identification of a location.
   * Comment: Occurrences for this data element is set to 0..* to allow one or more free text 'Address line' data elements to represent the huge variety of ways that ‘street-level' details may need to be recorded within the context of a specified 'Town'. Multiple address lines can be represented in a template, renamed as 'Address line 1', 'Address line 2,' etc. For example: '7A/52 Davis Street' or 'Apartment 7A' as Address line 1 with '52 Davis Street' as Address line 2; a roadside mail box location, such as 'RMB 725, Princes Highway'; or using a descriptive landmark, such as or 'Corner of Smith & Brown Streets' or 'Second house north of the general store with the red door'.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Address/Address line/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: Dental_bonus_booklet/context/Organisation/Address/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
