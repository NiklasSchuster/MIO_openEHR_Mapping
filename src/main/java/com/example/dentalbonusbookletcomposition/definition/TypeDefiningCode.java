package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum TypeDefiningCode implements EnumValueSet {
  PHYSICAL("Physical", "A physical location that can be visited.", "local", "at0011"),

  POSTAL("Postal", "Address used as a destination for mailing letters or parcels.", "local", "at0012"),

  BOTH("Both", "Address of a physical location, also used as a destination for mail.", "local", "at0013");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  TypeDefiningCode(String value, String description, String terminologyId, String code) {
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
