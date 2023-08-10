package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.Temporal;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PatientClusterContainment extends Containment {
  public SelectAqlField<PatientCluster> PATIENT_CLUSTER = new AqlFieldImp<PatientCluster>(PatientCluster.class, "", "PatientCluster", PatientCluster.class, this);

  public SelectAqlField<String> NAME_VALUE = new AqlFieldImp<String>(PatientCluster.class, "/items[at0001]/value|value", "nameValue", String.class, this);

  public SelectAqlField<NullFlavour> NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PatientCluster.class, "/items[at0001]/null_flavour|defining_code", "nameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> LABEL_VALUE = new AqlFieldImp<String>(PatientCluster.class, "/items[at0011]/value|value", "labelValue", String.class, this);

  public SelectAqlField<NullFlavour> LABEL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PatientCluster.class, "/items[at0011]/null_flavour|defining_code", "labelNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<StructuredNameOfAPersonCluster> STRUCTURED_NAME_OF_A_PERSON = new AqlFieldImp<StructuredNameOfAPersonCluster>(PatientCluster.class, "/items[openEHR-EHR-CLUSTER.structured_name.v1]", "structuredNameOfAPerson", StructuredNameOfAPersonCluster.class, this);

  public ListSelectAqlField<PatientIdentifierElement> IDENTIFIER = new ListAqlFieldImp<PatientIdentifierElement>(PatientCluster.class, "/items[at0003]", "identifier", PatientIdentifierElement.class, this);

  public SelectAqlField<AddressCluster> ADDRESS = new AqlFieldImp<AddressCluster>(PatientCluster.class, "/items[openEHR-EHR-CLUSTER.address.v1]", "address", AddressCluster.class, this);

  public ListSelectAqlField<Cluster> ELECTRONIC_COMMUNICATION = new ListAqlFieldImp<Cluster>(PatientCluster.class, "/items[at0006]", "electronicCommunication", Cluster.class, this);

  public ListSelectAqlField<Cluster> ORGANISATION = new ListAqlFieldImp<Cluster>(PatientCluster.class, "/items[at0007]", "organisation", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(PatientCluster.class, "/items[at0008]", "additionalDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> PHOTO = new ListAqlFieldImp<Cluster>(PatientCluster.class, "/items[at0009]", "photo", Cluster.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(PatientCluster.class, "/items[at0010]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PatientCluster.class, "/items[at0010]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Temporal> BIRTHDATE_VALUE = new AqlFieldImp<Temporal>(PatientCluster.class, "/items[at0.1]/value|value", "birthdateValue", Temporal.class, this);

  public SelectAqlField<NullFlavour> BIRTHDATE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PatientCluster.class, "/items[at0.1]/null_flavour|defining_code", "birthdateNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PatientCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private PatientClusterContainment() {
    super("openEHR-EHR-CLUSTER.person-patient.v1");
  }

  public static PatientClusterContainment getInstance() {
    return new PatientClusterContainment();
  }
}
