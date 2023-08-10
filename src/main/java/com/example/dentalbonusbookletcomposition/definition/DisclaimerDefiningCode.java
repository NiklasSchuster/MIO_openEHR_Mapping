package com.example.dentalbonusbookletcomposition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DisclaimerDefiningCode implements EnumValueSet {
  DIE_VERTRAGSPARTEIEN_SIND_SICH_EINIG_DASS_DER_ZAHNARZT_IM_NACHHINEIN_FUER_EINE_FALSCHE_JAHRESANGABE_NICHT_HAFTBAR_GEMACHT_WERDEN_KANN_WENN_DIE_KRANKENKASSE_BEI_DER_PRUEFUNG_EINES_HEIL_UND_KOSTENPLANES_KEINEN_BONUS_ODER_EINE_ANDERE_BONUSSTUFE_FESTSTELLT("Die Vertragsparteien sind sich einig, dass der Zahnarzt im Nachhinein für eine falsche Jahresangabe nicht haftbar gemacht werden kann, wenn die Krankenkasse bei der Prüfung eines Heil- und Kostenplanes keinen Bonus oder eine andere Bonusstufe feststellt.", "", "local", "at0014");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DisclaimerDefiningCode(String value, String description, String terminologyId, String code) {
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
