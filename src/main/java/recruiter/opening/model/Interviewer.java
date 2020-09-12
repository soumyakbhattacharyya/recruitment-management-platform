package recruiter.opening.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interviewer extends Recipient {

	private String id;
	private String userId;

}
