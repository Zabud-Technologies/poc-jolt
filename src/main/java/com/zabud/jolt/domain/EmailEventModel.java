package com.zabud.jolt.domain;

import lombok.Setter;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;

@Getter
@Setter
public class EmailEventModel implements Serializable{

  private static final long serialVersionUID = 1L;
  private List<Attachment> attachmentList;
  
}
