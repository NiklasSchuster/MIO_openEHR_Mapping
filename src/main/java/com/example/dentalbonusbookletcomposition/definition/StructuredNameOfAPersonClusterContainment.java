package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class StructuredNameOfAPersonClusterContainment extends Containment {
  public SelectAqlField<StructuredNameOfAPersonCluster> STRUCTURED_NAME_OF_A_PERSON_CLUSTER = new AqlFieldImp<StructuredNameOfAPersonCluster>(StructuredNameOfAPersonCluster.class, "", "StructuredNameOfAPersonCluster", StructuredNameOfAPersonCluster.class, this);

  public SelectAqlField<String> PREFIX_VALUE = new AqlFieldImp<String>(StructuredNameOfAPersonCluster.class, "/items[at0001]/value|value", "prefixValue", String.class, this);

  public SelectAqlField<NullFlavour> PREFIX_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StructuredNameOfAPersonCluster.class, "/items[at0001]/null_flavour|defining_code", "prefixNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GIVEN_NAME_VALUE = new AqlFieldImp<String>(StructuredNameOfAPersonCluster.class, "/items[at0002]/value|value", "givenNameValue", String.class, this);

  public SelectAqlField<NullFlavour> GIVEN_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StructuredNameOfAPersonCluster.class, "/items[at0002]/null_flavour|defining_code", "givenNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> FAMILY_NAME_VALUE = new AqlFieldImp<String>(StructuredNameOfAPersonCluster.class, "/items[at0005]/value|value", "familyNameValue", String.class, this);

  public SelectAqlField<NullFlavour> FAMILY_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StructuredNameOfAPersonCluster.class, "/items[at0005]/null_flavour|defining_code", "familyNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SUFFIX_VALUE = new AqlFieldImp<String>(StructuredNameOfAPersonCluster.class, "/items[at0006]/value|value", "suffixValue", String.class, this);

  public SelectAqlField<NullFlavour> SUFFIX_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(StructuredNameOfAPersonCluster.class, "/items[at0006]/null_flavour|defining_code", "suffixNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(StructuredNameOfAPersonCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private StructuredNameOfAPersonClusterContainment() {
    super("openEHR-EHR-CLUSTER.structured_name.v1");
  }

  public static StructuredNameOfAPersonClusterContainment getInstance() {
    return new StructuredNameOfAPersonClusterContainment();
  }
}
