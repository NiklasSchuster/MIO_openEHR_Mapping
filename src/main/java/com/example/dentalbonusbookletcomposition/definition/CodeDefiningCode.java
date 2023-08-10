package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CodeDefiningCode implements EnumValueSet {
  DATUM_SEIT_DEM_EINE_LUECKENLOSE_DOKUMENTATION_IN_DEM_PAPIER_ZAHNBONUSHEFT_NACHWEISLICH_VORLIEGT("Datum, seit dem eine lückenlose Dokumentation in dem Papier-Zahnbonusheft nachweislich vorliegt.", "", "local", "at0013");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CodeDefiningCode(String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
