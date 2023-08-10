package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.gapless_documentation.v0")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.362433700+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class GaplessDocumentationObservation implements EntryEntity {
  /**
   * Path: Dental_bonus_booklet/gapless_documentation/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation/Any event
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<GaplessDocumentationAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setAnyEvent(List<GaplessDocumentationAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<GaplessDocumentationAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
