package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.337431400+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class AddressUseDvText implements RMEntity, AddressUseChoice {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Use/Use
   * Description: The primary purpose or use for the address.
   */
  @Path("|value")
  private String useValue;

  public void setUseValue(String useValue) {
     this.useValue = useValue;
  }

  public String getUseValue() {
     return this.useValue ;
  }
}
