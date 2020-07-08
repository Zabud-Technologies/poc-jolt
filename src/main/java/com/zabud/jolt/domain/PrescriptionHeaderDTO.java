package com.zabud.jolt.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Julio Avila C
 */

@Getter
@Setter
public class PrescriptionHeaderDTO {

  private String nameIPS;

  private String noPrescripcion;

  private String fPrescripcion;

  private String hPrescripcion;

  private String codHabIPS;

  private String tipoIDIPS;

  private String nroIDIPS;

  private String codDANEMunIPS;

  private String dirSedeIPS;

  private String telSedeIPS;

  private String tipoIDProf;

  private String numIDProf;

  private String pNProfS;

  private String sNProfS;

  private String pAProfS;

  private String sAProfS;

  private String regProfS;

  private String tipoIDPaciente;

  private String nroIDPaciente;

  private String pNPaciente;

  private String sNPaciente;

  private String pAPaciente;

  private String sAPaciente;

  private String codAmbAte;

  private String refAmbAte;

  private String enfHuerfana;

  private String codEnfHuerfana;

  private String enfHuerfanaDX;

  private String codDxPpal;

  private String codDxRel1;

  private String codDxRel2;

  private String sopNutricional;

  private String codEPS;

  private String tipoIDMadrePaciente;

  private String nroIDMadrePaciente;

  private String tipoTransc;

  private String tipoIDDonanteVivo;

  private String nroIDDonanteVivo;

  private String estPres;

  private String regimen;
  private String rownum;

  private List<ValidationStatusDTO> msgsError;

}
