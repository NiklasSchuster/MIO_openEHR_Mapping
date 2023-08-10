package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum TypeDefiningCode2 implements EnumValueSet {
  URL("Url", "", "local", "at0.1"),

  PAGER("Pager", "", "local", "at0008"),

  FAX("Fax", "", "local", "at0009"),

  MOBILE_CELLULAR_TELEPHONE("Mobile (cellular) telephone", "For SMS or voice calls.", "local", "at0005"),

  EMAIL("Email", "", "local", "at0007"),

  TELEPHONE_EXCLUDING_MOBILE_TELEPHONE("Telephone (excluding mobile telephone)", "", "local", "at0006"),

  OTHER("Other", "", "local", "at0.2");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  TypeDefiningCode2(String value, String description, String terminologyId, String code) {
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
