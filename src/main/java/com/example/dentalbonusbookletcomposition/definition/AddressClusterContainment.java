package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class AddressClusterContainment extends Containment {
  public SelectAqlField<AddressCluster> ADDRESS_CLUSTER = new AqlFieldImp<AddressCluster>(AddressCluster.class, "", "AddressCluster", AddressCluster.class, this);

  public ListSelectAqlField<AddressAddressLineElement> ADDRESS_LINE = new ListAqlFieldImp<AddressAddressLineElement>(AddressCluster.class, "/items[at0001]", "addressLine", AddressAddressLineElement.class, this);

  public SelectAqlField<String> TOWN_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0002]/value|value", "townValue", String.class, this);

  public SelectAqlField<NullFlavour> TOWN_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0002]/null_flavour|defining_code", "townNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DISTRICT_COUNTY_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0003]/value|value", "districtCountyValue", String.class, this);

  public SelectAqlField<NullFlavour> DISTRICT_COUNTY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0003]/null_flavour|defining_code", "districtCountyNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> POSTAL_CODE_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0005]/value|value", "postalCodeValue", String.class, this);

  public SelectAqlField<NullFlavour> POSTAL_CODE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0005]/null_flavour|defining_code", "postalCodeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COUNTRY_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0006]/value|value", "countryValue", String.class, this);

  public SelectAqlField<NullFlavour> COUNTRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0006]/null_flavour|defining_code", "countryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0010]/null_flavour|defining_code", "typeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> USE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0014]/null_flavour|defining_code", "useNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(AddressCluster.class, "/items[at0018]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster.class, "/items[at0018]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AddressCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AddressTypeChoice> TYPE = new AqlFieldImp<AddressTypeChoice>(AddressCluster.class, "/items[at0010]/value", "type", AddressTypeChoice.class, this);

  public SelectAqlField<AddressUseChoice> USE = new AqlFieldImp<AddressUseChoice>(AddressCluster.class, "/items[at0014]/value", "use", AddressUseChoice.class, this);

  private AddressClusterContainment() {
    super("openEHR-EHR-CLUSTER.address.v1");
  }

  public static AddressClusterContainment getInstance() {
    return new AddressClusterContainment();
  }
}
