package com.example.dentalbonusbookletcomposition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.336417200+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AddressUseDvCodedText implements RMEntity, AddressUseChoice {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Use/Use
   * Description: The primary purpose or use for the address.
   */
  @Path("|defining_code")
  private UseDefiningCode useDefiningCode;

  public void setUseDefiningCode(UseDefiningCode useDefiningCode) {
     this.useDefiningCode = useDefiningCode;
  }

  public UseDefiningCode getUseDefiningCode() {
     return this.useDefiningCode ;
  }
}
