package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class OrganisationClusterContainment extends Containment {
  public SelectAqlField<OrganisationCluster> ORGANISATION_CLUSTER = new AqlFieldImp<OrganisationCluster>(OrganisationCluster.class, "", "OrganisationCluster", OrganisationCluster.class, this);

  public SelectAqlField<String> NAME_VALUE = new AqlFieldImp<String>(OrganisationCluster.class, "/items[at0001]/value|value", "nameValue", String.class, this);

  public SelectAqlField<NullFlavour> NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OrganisationCluster.class, "/items[at0001]/null_flavour|defining_code", "nameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> IDENTIFIER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OrganisationCluster.class, "/items[at0003]/null_flavour|defining_code", "identifierNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<AddressCluster2> ADDRESS = new AqlFieldImp<AddressCluster2>(OrganisationCluster.class, "/items[openEHR-EHR-CLUSTER.address.v1]", "address", AddressCluster2.class, this);

  public ListSelectAqlField<ElectronicCommunicationCluster> ELECTRONIC_COMMUNICATION = new ListAqlFieldImp<ElectronicCommunicationCluster>(OrganisationCluster.class, "/items[openEHR-EHR-CLUSTER.electronic_communication-dental_booklet.v1]", "electronicCommunication", ElectronicCommunicationCluster.class, this);

  public ListSelectAqlField<Cluster> CONTACT_PERSON = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0002]", "contactPerson", Cluster.class, this);

  public ListSelectAqlField<Cluster> PARENT_ORGANISATION = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0021]", "parentOrganisation", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0017]", "additionalDetails", Cluster.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(OrganisationCluster.class, "/items[at0019]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OrganisationCluster.class, "/items[at0019]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OrganisationCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<OrganisationIdentifierChoice> IDENTIFIER = new AqlFieldImp<OrganisationIdentifierChoice>(OrganisationCluster.class, "/items[at0003]/value", "identifier", OrganisationIdentifierChoice.class, this);

  private OrganisationClusterContainment() {
    super("openEHR-EHR-CLUSTER.organisation.v1");
  }

  public static OrganisationClusterContainment getInstance() {
    return new OrganisationClusterContainment();
  }
}
