package com.example.dentalbonusbookletcomposition.definition;

import java.net.URI;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.356433100+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_URI")
public class ElectronicCommunicationValueDvUri implements RMEntity, ElectronicCommunicationValueChoice {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Electronic communication/Value/Value
   * Description: The unique combination of alphanumeric characters, relevant for representation of 'Type'.
   * Comment: For example: area code + landline phone/pager number; country code + mobile phone number; or email address.
   */
  @Path("|value")
  private URI valueValue;

  public void setValueValue(URI valueValue) {
     this.valueValue = valueValue;
  }

  public URI getValueValue() {
     return this.valueValue ;
  }
}
