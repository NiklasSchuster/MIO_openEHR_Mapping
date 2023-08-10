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
    date = "2023-08-08T18:13:39.334300700+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class AddressTypeDvText implements RMEntity, AddressTypeChoice {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Address/Type/Type
   * Description: The type of address.
   * Comment: For example: physical or postal.
   */
  @Path("|value")
  private String typeValue;

  public void setTypeValue(String typeValue) {
     this.typeValue = typeValue;
  }

  public String getTypeValue() {
     return this.typeValue ;
  }
}
