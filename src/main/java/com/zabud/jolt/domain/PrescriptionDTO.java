package com.zabud.jolt.domain;

import java.util.List;
import lombok.Data;

@Data
public class PrescriptionDTO {

  private PrescriptionHeaderDTO prescripcionEncabezado;

  private List<MedicamentDTO> medicamentosList;

  private List<ProcedureDTO> procedimientosList;

  private List<DeviceDTO> dispositivosList;

  private List<NutritionalProductDTO> productosNutricionalesList;

  private List<ComplementaryServiceDTO> serviciosComplementariosList;

  private String jsonResult;

}
