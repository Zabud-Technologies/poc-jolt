package com.zabud.jolt.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class TechnologiesDTO {

  private String noPrescription;
  private LocalDate creationDate;
  private LocalDate lastUpdate;

  private int conOrden;

  private String justNoPBS;

  private String indRec;

  private String estJM;

  private String tipoPrest;

  private String justificacionTecnica;

  private String modalidad;

  private String numeroActa;

  private String fechaActa;

  private String fechaProceso;
}
