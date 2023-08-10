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
    date = "2023-08-08T18:13:39.347430300+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AddressTownElement implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Address/Town
   * Description: The name of the suburb, town, city, village, community or lowest level locality that contains the address.
   * Comment: Coding with an external terminology is preferred, where possible. For example: 'Fitzroy'; 'Manchester'; 'Kingston' or 'Bergen'.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Address/Town/null_flavour
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
