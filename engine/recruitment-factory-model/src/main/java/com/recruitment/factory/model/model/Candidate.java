package com.recruitment.factory.model.model;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends Recipient {

  private String firstName;
  private String lastName;
  private String phone;
  private String description;

  private Resume resume;

  private Date createdOn;
  private Date updatedOn;
  private Map<String, String> profileData;
  private String source;
  private String sourceType;
  private Interviewer assignedTo;
  private String openingId;
  private Stage stage;
  private STATE state;
  private Map<String, String> stateMetadata;
}
