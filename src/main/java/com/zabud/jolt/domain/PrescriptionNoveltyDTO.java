package com.zabud.jolt.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class PrescriptionNoveltyDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long tipoNov;

  private String noPrescripcion;

  private String noPrescripcionF;

  private String fNov;

}
