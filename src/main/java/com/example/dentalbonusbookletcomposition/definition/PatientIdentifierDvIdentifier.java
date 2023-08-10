package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.310040400+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_IDENTIFIER")
public class PatientIdentifierDvIdentifier implements RMEntity, PatientIdentifierChoice {
  /**
   * Path: Dental_bonus_booklet/context/Patient/Identifier/Identifier
   * Description: Identifier associated with the individual.
   * Comment: Occurrences for this data element is set to 0..* to allow for more than one Identifier to be recorded. Note that the DV_IDENTIFIER data type contains multiple subcomponents for recording the ID value, type, issuer and assigned. For example - social security number; driver's license; or passport number.
   */
  @Path("")
  private DvIdentifier identifier;

  public void setIdentifier(DvIdentifier identifier) {
     this.identifier = identifier;
  }

  public DvIdentifier getIdentifier() {
     return this.identifier ;
  }
}
