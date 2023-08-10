package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ElectronicCommunicationClusterContainment extends Containment {
  public SelectAqlField<ElectronicCommunicationCluster> ELECTRONIC_COMMUNICATION_CLUSTER = new AqlFieldImp<ElectronicCommunicationCluster>(ElectronicCommunicationCluster.class, "", "ElectronicCommunicationCluster", ElectronicCommunicationCluster.class, this);

  public SelectAqlField<TypeDefiningCode2> TYPE_DEFINING_CODE = new AqlFieldImp<TypeDefiningCode2>(ElectronicCommunicationCluster.class, "/items[at0001.1]/value|defining_code", "typeDefiningCode", TypeDefiningCode2.class, this);

  public SelectAqlField<NullFlavour> TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ElectronicCommunicationCluster.class, "/items[at0001.1]/null_flavour|defining_code", "typeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> VALUE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ElectronicCommunicationCluster.class, "/items[at0002]/null_flavour|defining_code", "valueNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(ElectronicCommunicationCluster.class, "/items[at0013]", "additionalDetails", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ElectronicCommunicationCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ElectronicCommunicationValueChoice> VALUE = new AqlFieldImp<ElectronicCommunicationValueChoice>(ElectronicCommunicationCluster.class, "/items[at0002]/value", "value", ElectronicCommunicationValueChoice.class, this);

  private ElectronicCommunicationClusterContainment() {
    super("openEHR-EHR-CLUSTER.electronic_communication-dental_booklet.v1");
  }

  public static ElectronicCommunicationClusterContainment getInstance() {
    return new ElectronicCommunicationClusterContainment();
  }
}
