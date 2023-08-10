package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class GaplessDocumentationObservationContainment extends Containment {
  public SelectAqlField<GaplessDocumentationObservation> GAPLESS_DOCUMENTATION_OBSERVATION = new AqlFieldImp<GaplessDocumentationObservation>(GaplessDocumentationObservation.class, "", "GaplessDocumentationObservation", GaplessDocumentationObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(GaplessDocumentationObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(GaplessDocumentationObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(GaplessDocumentationObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(GaplessDocumentationObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<GaplessDocumentationAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<GaplessDocumentationAnyEventChoice>(GaplessDocumentationObservation.class, "/data[at0001]/events[at0002]", "anyEvent", GaplessDocumentationAnyEventChoice.class, this);

  private GaplessDocumentationObservationContainment() {
    super("openEHR-EHR-OBSERVATION.gapless_documentation.v0");
  }

  public static GaplessDocumentationObservationContainment getInstance() {
    return new GaplessDocumentationObservationContainment();
  }
}
