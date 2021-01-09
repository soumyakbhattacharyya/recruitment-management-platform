package opening;

/*
 * factory creates aggregates
 * typically when an aggregate is required to be initialized using different combinations of input values, factory is utilized
 */
public class OpeningFactory {

  public static final OpeningFactory THIS = new OpeningFactory();

  private OpeningFactory() {
  }

  public Opening createOpening() {
    return new Opening();
  }

}
