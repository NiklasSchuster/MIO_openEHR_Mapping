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

public class DentalCheckUpObservationContainment extends Containment {
  public SelectAqlField<DentalCheckUpObservation> DENTAL_CHECK_UP_OBSERVATION = new AqlFieldImp<DentalCheckUpObservation>(DentalCheckUpObservation.class, "", "DentalCheckUpObservation", DentalCheckUpObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(DentalCheckUpObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DentalCheckUpObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DentalCheckUpObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DentalCheckUpObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<DentalCheckUpAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<DentalCheckUpAnyEventChoice>(DentalCheckUpObservation.class, "/data[at0001]/events[at0002]", "anyEvent", DentalCheckUpAnyEventChoice.class, this);

  private DentalCheckUpObservationContainment() {
    super("openEHR-EHR-OBSERVATION.dental_check_up.v0");
  }

  public static DentalCheckUpObservationContainment getInstance() {
    return new DentalCheckUpObservationContainment();
  }
}
