package com.zabud.jolt.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventModel implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String code;
  private String recipient;
  private String recipientName;
  private EmailEventModel exchange;
  private String recipientBcc;
  private String subject;

}
