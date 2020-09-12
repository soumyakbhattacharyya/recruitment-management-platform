package recruiter.opening;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruiterApplication.class, args);
	}
	
	/**
	 * features
	 * 
	 * 1. as an administrator I am able to create, update, query and archive opening
	 * 2. as a user I should be able to define the stages associated with an opening
	 * 3. as a user once I have defined the opening I can forward the same for approval
	 * 4. as a user I am able to define the application form that the candidate is required to fill in
	 */

}
