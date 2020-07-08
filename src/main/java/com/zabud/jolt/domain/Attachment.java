package com.zabud.jolt.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachment implements Serializable{

  private static final long serialVersionUID = 1L;
  private byte[] content;
  private String fileName;
  private String type;
  
}
