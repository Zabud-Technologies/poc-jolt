package com.zabud.jolt.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *  @author Julio Avila C
 *  
 */
@Getter
@Setter
public class ComplementaryServiceDTO extends TechnologiesDTO {

  private String causaS1;

  private String causaS2;

  private String causaS3;

  private String causaS4;

  private String descCausaS4;

  private String causaS5;

  private String codSerComp;

  private String descSerComp;

  private String canForm;

  private String cadaFreUso;
  
  private String codFreUso;

  private String cant;

  private String cantTotal;

  private String codPerDurTrat;
  
  private String tipoTrans;

  private String reqAcom;

  private String tipoIDAcomAlb;

  private String nroIDAcomAlb;

  private String parentAcomAlb;

  private String nombAlb;

  private String codMunOriAlb;

  private String codMunDesAlb;
}
