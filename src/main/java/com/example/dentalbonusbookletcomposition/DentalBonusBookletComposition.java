package com.example.dentalbonusbookletcomposition;

import com.example.dentalbonusbookletcomposition.definition.DentalCheckUpObservation;
import com.example.dentalbonusbookletcomposition.definition.GaplessDocumentationObservation;
import com.example.dentalbonusbookletcomposition.definition.OrganisationCluster;
import com.example.dentalbonusbookletcomposition.definition.PatientCluster;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import com.nedap.archie.rm.support.identification.ObjectVersionId;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.dentalbonusbooklet.v0")
@Generated(
    value = "org.ehrbase.openehr.sdk.generator.ClassGenerator",
    date = "2023-08-08T18:13:39.279042300+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@Template("dental_bonus_booklet")
public class DentalBonusBookletComposition implements CompositionEntity {
  /**
   * Path: Dental_bonus_booklet/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: Dental_bonus_booklet/context/Patient
   * Description: An individual human being.
   */
  @Path("/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.person-patient.v1 and name/value='Patient']")
  private PatientCluster patient;

  /**
   * Path: Dental_bonus_booklet/context/Organisation
   * Description: An entity comprising one or more people and having a particular purpose.
   * Comment: For example: a company, institution, association, network, department, community group, healthcare practice group, payer/insurer, care team, or a group of neighbours who provide care or support.
   */
  @Path("/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.organisation.v1]")
  private OrganisationCluster organisation;

  /**
   * Path: Dental_bonus_booklet/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: Dental_bonus_booklet/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: Dental_bonus_booklet/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: Dental_bonus_booklet/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: Dental_bonus_booklet/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: Dental_bonus_booklet/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: Dental_bonus_booklet/gapless_documentation
   * Description: gapless_documentation
   */
  @Path("/content[openEHR-EHR-OBSERVATION.gapless_documentation.v0]")
  private GaplessDocumentationObservation gaplessDocumentation;

  /**
   * Path: Dental_bonus_booklet/Dental_Check_Up
   * Description: Dental_Check_Up
   */
  @Path("/content[openEHR-EHR-OBSERVATION.dental_check_up.v0]")
  private DentalCheckUpObservation dentalCheckUp;

  /**
   * Path: Dental_bonus_booklet/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: Dental_bonus_booklet/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Dental_bonus_booklet/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Dental_bonus_booklet/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setPatient(PatientCluster patient) {
     this.patient = patient;
  }

  public PatientCluster getPatient() {
     return this.patient ;
  }

  public void setOrganisation(OrganisationCluster organisation) {
     this.organisation = organisation;
  }

  public OrganisationCluster getOrganisation() {
     return this.organisation ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setGaplessDocumentation(GaplessDocumentationObservation gaplessDocumentation) {
     this.gaplessDocumentation = gaplessDocumentation;
  }

  public GaplessDocumentationObservation getGaplessDocumentation() {
     return this.gaplessDocumentation ;
  }

  public void setDentalCheckUp(DentalCheckUpObservation dentalCheckUp) {
     this.dentalCheckUp = dentalCheckUp;
  }

  public DentalCheckUpObservation getDentalCheckUp() {
     return this.dentalCheckUp ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
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

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
