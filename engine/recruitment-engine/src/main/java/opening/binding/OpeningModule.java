package opening.binding;

import com.google.inject.AbstractModule;

import opening.OpeningRepository;
import opening.OpeningRepositoryImpl;

public class OpeningModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(OpeningRepository.class).to(OpeningRepositoryImpl.class);

  }
}