package recruiter.opening.resource;

import java.util.List;
import java.util.UUID;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import recruiter.opening.model.Opening;
import recruiter.opening.repository.OpeningRepository;

@RestController
public class OpeningResource {

	@Autowired
	private OpeningRepository repository;

	@GetMapping("/openings")
	public List<Opening> getAll() {
		return repository.findAll();
	}

	@GetMapping("/openings/{openingId}")
	public Opening getOne(@PathParam(value = "openingId") String openingId) {
		return repository.findOne(openingId);
	}

	@PostMapping("/openings")
	public Opening create(@RequestBody Opening newOpening) {
		return repository.create(newOpening);
	}

}
