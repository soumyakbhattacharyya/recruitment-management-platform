package recruiter.opening.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Opening {

	private String id;
	private String title;
	private String description;
	private String team;
	private String state;
	private String positionType;
	private String isRemoteAllowed;

	private Location location;
	private boolean isPrivate;
	private String hostedUrl;
	private boolean isArchived;
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
}
