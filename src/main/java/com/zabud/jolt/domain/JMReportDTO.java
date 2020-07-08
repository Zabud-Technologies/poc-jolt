package com.zabud.jolt.domain;

import java.io.Serializable;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JMReportDTO implements Serializable{
  
  /**
   * 
   */
  private static final long serialVersionUID = 6492399047075150317L;
  String code;
  Map<String, Object> tags;  

}
