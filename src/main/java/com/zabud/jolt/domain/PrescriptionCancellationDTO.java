package com.zabud.jolt.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class PrescriptionCancellationDTO implements Serializable{
  
  private static final long serialVersionUID = 1L;

  private String noPrescripcion;
  
  private Long tipoAnulacion;
  
  private String justificacion;
  
  private String observacion;
  
  private String fSolicitud;
  
  private String usuarioSolicita;
  
  private Long estAnulacion;
  
  private String fAnulacion;
  
  private String usuarioAnula;

}
