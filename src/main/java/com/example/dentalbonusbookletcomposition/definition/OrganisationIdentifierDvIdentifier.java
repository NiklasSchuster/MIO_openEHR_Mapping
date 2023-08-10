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
    date = "2023-08-08T18:13:39.359430600+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_IDENTIFIER")
public class OrganisationIdentifierDvIdentifier implements RMEntity, OrganisationIdentifierChoice {
  /**
   * Path: Dental_bonus_booklet/context/Organisation/Identifier/Identifier
   * Description: Identifier associated with the organisation.
   * Comment: Occurrences for this data element is set to 0..* to allow for more than one Identifier to be recorded. Note that the ID data type contains multiple subcomponents for recording the ID value, type, issuer and assigner.
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
