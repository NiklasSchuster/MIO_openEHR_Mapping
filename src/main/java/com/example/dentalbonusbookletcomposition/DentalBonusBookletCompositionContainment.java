package com.example.dentalbonusbookletcomposition;

import com.example.dentalbonusbookletcomposition.definition.DentalCheckUpObservation;
import com.example.dentalbonusbookletcomposition.definition.GaplessDocumentationObservation;
import com.example.dentalbonusbookletcomposition.definition.OrganisationCluster;
import com.example.dentalbonusbookletcomposition.definition.PatientCluster;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class DentalBonusBookletCompositionContainment extends Containment {
  public SelectAqlField<DentalBonusBookletComposition> DENTAL_BONUS_BOOKLET_COMPOSITION = new AqlFieldImp<DentalBonusBookletComposition>(DentalBonusBookletComposition.class, "", "DentalBonusBookletComposition", DentalBonusBookletComposition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(DentalBonusBookletComposition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<PatientCluster> PATIENT = new AqlFieldImp<PatientCluster>(DentalBonusBookletComposition.class, "/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.person-patient.v1]", "patient", PatientCluster.class, this);

  public SelectAqlField<OrganisationCluster> ORGANISATION = new AqlFieldImp<OrganisationCluster>(DentalBonusBookletComposition.class, "/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.organisation.v1]", "organisation", OrganisationCluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(DentalBonusBookletComposition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(DentalBonusBookletComposition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(DentalBonusBookletComposition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(DentalBonusBookletComposition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(DentalBonusBookletComposition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(DentalBonusBookletComposition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<GaplessDocumentationObservation> GAPLESS_DOCUMENTATION = new AqlFieldImp<GaplessDocumentationObservation>(DentalBonusBookletComposition.class, "/content[openEHR-EHR-OBSERVATION.gapless_documentation.v0]", "gaplessDocumentation", GaplessDocumentationObservation.class, this);

  public SelectAqlField<DentalCheckUpObservation> DENTAL_CHECK_UP = new AqlFieldImp<DentalCheckUpObservation>(DentalBonusBookletComposition.class, "/content[openEHR-EHR-OBSERVATION.dental_check_up.v0]", "dentalCheckUp", DentalCheckUpObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(DentalBonusBookletComposition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DentalBonusBookletComposition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DentalBonusBookletComposition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(DentalBonusBookletComposition.class, "/territory", "territory", Territory.class, this);

  private DentalBonusBookletCompositionContainment() {
    super("openEHR-EHR-COMPOSITION.dentalbonusbooklet.v0");
  }

  public static DentalBonusBookletCompositionContainment getInstance() {
    return new DentalBonusBookletCompositionContainment();
  }
}
