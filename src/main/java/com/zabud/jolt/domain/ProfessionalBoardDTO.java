package com.zabud.jolt.domain;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.Data;

@Data
@JsonSerializableSchema(id = "prescripcion_novedades")
public class ProfessionalBoardDTO {
  
  private String noPrescripcion;
  
  private String fPrescripcion;
  
  private String tipoTecnologia;
  
  private int consecutivo;

  private String estJM;
  
  private String codEntProc;
  
  private String observaciones;
  
  private String justificacionTecnica;
  
  private String modalidad;
  
  private String noActa;
  
  private String fechaActa;
  
  private String fProceso;
  
  private String tipoIDPaciente;
  
  private String nroIDPaciente;
  
  private String codEntJM;
  
}
