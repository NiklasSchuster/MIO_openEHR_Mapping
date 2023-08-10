package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CheckupDefiningCode implements EnumValueSet {
  DENTAL_PROPHYLAXIS_CHILDREN_PROCEDURE("Dental prophylaxis, children (procedure)", "The type of dental prophylaxis", "local", "at0018"),

  DENTAL_PROPHYLAXIS_ADULT_PROCEDURE("Dental prophylaxis, adult (procedure)", "The type of dental prophylaxis", "local", "at0017");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CheckupDefiningCode(String value, String description, String terminologyId, String code) {
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
