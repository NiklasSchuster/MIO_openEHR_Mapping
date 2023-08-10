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
    date = "2023-08-08T18:13:39.348430200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AddressDistrictCountyElement implements LocatableEntity {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Address/District/County
   * Description: The name of a local government district or geographical area that contains the address.
   * Comment: Coding with an external terminology is preferred, where possible. For example: 'Surf Coast' and 'Yarra' local government councils in Victoria, Australia;and the Parishes of 'Saint Andrew' and 'Kingston' in Jamaica..
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: Dental_bonus_booklet/context/Tree/Organisation/Address/District/County/null_flavour
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
