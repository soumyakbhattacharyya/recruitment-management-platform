package opening;

import java.util.Optional;

public interface OpeningRepository {

  Optional<Opening> get(String id);

  boolean contains(OpeningId id);

  void add(Opening opening);

  void remove(Opening opening);

}
