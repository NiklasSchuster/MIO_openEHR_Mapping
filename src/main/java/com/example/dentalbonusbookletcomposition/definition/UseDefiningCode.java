package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum UseDefiningCode implements EnumValueSet {
  RESIDENTIAL("Residential", "Address of where a person is living on a regular basis.", "local", "at0016"),

  BUSINESS("Business", "Address of the physical location of a business or office.", "local", "at0015"),

  TEMPORARY_ACCOMMODATION("Temporary accommodation", "Address of where a person is living on a temporary basis.", "local", "at0017");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  UseDefiningCode(String value, String description, String terminologyId, String code) {
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
