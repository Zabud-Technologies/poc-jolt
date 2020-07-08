package com.zabud.jolt.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Julio Avila C
 */
@Getter
@Setter
public class MedicamentDTO extends TechnologiesDTO {

  private String tipoMed;

  private String causaS1;

  private String causaS2;

  private String causaS3;

  private String medPBSUtilizado;

  private String rznCausaS31;

  private String descRzn31;

  private String rznCausaS32;

  private String descRzn32;

  private String causaS4;

  private String medPBSDescartado;

  private String rznCausaS41;

  private String descRzn41;

  private String rznCausaS42;

  private String descRzn42;

  private String rznCausaS43;

  private String descRzn43;

  private String rznCausaS44;

  private String descRzn44;

  private String causaS5;

  private String rznCausaS5;

  private String causaS6;

  private String descMedPrinAct;

  private String codFF;

  private String codVA;

  private String dosis;

  private String dosisUM;

  private String noFAdmon;

  private String codFreAdmon;

  private String indEsp;

  private String canTrat;

  private String durTrat;

  private String cantTotalF;

  private String uFCantTotal;

  private List<ActivePrincipleDTO> principioActivosList;

  private List<UnirsIndicationDTO> indicacionesUnirsList;

}
