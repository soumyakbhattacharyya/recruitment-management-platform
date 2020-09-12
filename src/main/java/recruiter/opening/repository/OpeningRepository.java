package recruiter.opening.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import recruiter.opening.model.Opening;

@Component
public class OpeningRepository {

	private static Map<String, Opening> store = new HashMap<>();

	public static Opening create(Opening opening) {
		return store.put(opening.getId(), opening);
	}

	public static Opening update(String openingId, Opening updatedOpening) {
		return store.replace(openingId, updatedOpening);
	}

	public static Opening delete(String openingId) {
		return store.remove(openingId);
	}

	public static Opening findOne(String openingId) {
		return store.get(openingId);
	}

	public static List<Opening> findAll() {
		return store.values().stream().collect(Collectors.toList());
	}

}
