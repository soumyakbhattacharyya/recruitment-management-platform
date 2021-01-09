package org.soumyak.recruitment.engine.model;

import java.util.Date;

import lombok.Data;
import opening.Opening;

@Data
public class Feedback {

	private String id;
	private Integer rating;
	private String feedbackText;
	private String criteria;
	private Interviewer submittedBy;
	private Date submittedOn;
	private Opening opening;
	private Stage stage;
}
