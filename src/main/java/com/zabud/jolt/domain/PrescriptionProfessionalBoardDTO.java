package com.zabud.jolt.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrescriptionProfessionalBoardDTO {
  
  String noPrescription;
  
  String cantDeviceWithoutJM;
  
  String cantMedicamentWithoutJM;
  
  String cantProcedureWithoutJM;
  
  String cantComplementaryServiceWithoutJM;
  
  String cantNutritonalProductWithoutJM;
  
  String totalTecnologiesWithoutJM;

}
