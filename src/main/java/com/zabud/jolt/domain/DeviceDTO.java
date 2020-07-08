package com.zabud.jolt.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Julio Avila C
 */
@Setter
@Getter
public class DeviceDTO extends TechnologiesDTO {

  private String causaS1;

  private String codDisp;

  private String canForm;

  private String cadaFreUso;

  private String codFreUso;

  private String cant;

  private String cantTotal;

  private String codPerDurTrat;

}
