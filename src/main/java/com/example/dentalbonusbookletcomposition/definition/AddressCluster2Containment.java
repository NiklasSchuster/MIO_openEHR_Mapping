package com.example.dentalbonusbookletcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class AddressCluster2Containment extends Containment {
  public SelectAqlField<AddressCluster2> ADDRESS_CLUSTER2 = new AqlFieldImp<AddressCluster2>(AddressCluster2.class, "", "AddressCluster2", AddressCluster2.class, this);

  public ListSelectAqlField<AddressAddressLineElement2> ADDRESS_LINE = new ListAqlFieldImp<AddressAddressLineElement2>(AddressCluster2.class, "/items[at0001]", "addressLine", AddressAddressLineElement2.class, this);

  public ListSelectAqlField<AddressTownElement> TOWN = new ListAqlFieldImp<AddressTownElement>(AddressCluster2.class, "/items[at0002]", "town", AddressTownElement.class, this);

  public ListSelectAqlField<AddressDistrictCountyElement> DISTRICT_COUNTY = new ListAqlFieldImp<AddressDistrictCountyElement>(AddressCluster2.class, "/items[at0003]", "districtCounty", AddressDistrictCountyElement.class, this);

  public SelectAqlField<String> POSTAL_CODE_VALUE = new AqlFieldImp<String>(AddressCluster2.class, "/items[at0005]/value|value", "postalCodeValue", String.class, this);

  public SelectAqlField<NullFlavour> POSTAL_CODE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster2.class, "/items[at0005]/null_flavour|defining_code", "postalCodeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COUNTRY_VALUE = new AqlFieldImp<String>(AddressCluster2.class, "/items[at0006]/value|value", "countryValue", String.class, this);

  public SelectAqlField<NullFlavour> COUNTRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster2.class, "/items[at0006]/null_flavour|defining_code", "countryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster2.class, "/items[at0010]/null_flavour|defining_code", "typeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> USE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster2.class, "/items[at0014]/null_flavour|defining_code", "useNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(AddressCluster2.class, "/items[at0018]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AddressCluster2.class, "/items[at0018]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AddressCluster2.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AddressTypeChoice> TYPE = new AqlFieldImp<AddressTypeChoice>(AddressCluster2.class, "/items[at0010]/value", "type", AddressTypeChoice.class, this);

  public SelectAqlField<AddressUseChoice> USE = new AqlFieldImp<AddressUseChoice>(AddressCluster2.class, "/items[at0014]/value", "use", AddressUseChoice.class, this);

  private AddressCluster2Containment() {
    super("openEHR-EHR-CLUSTER.address.v1");
  }

  public static AddressCluster2Containment getInstance() {
    return new AddressCluster2Containment();
  }
}
