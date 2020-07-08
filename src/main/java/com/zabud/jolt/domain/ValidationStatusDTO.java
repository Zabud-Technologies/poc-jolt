package com.zabud.jolt.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ValidationStatusDTO {
  
  @JsonProperty("field")
  private String field;
  
  @JsonProperty("description")
  private String description;
  
  @JsonProperty("type")
  private String type;

  @JsonProperty("consecutive")
  private Integer consecutive;
  

}
