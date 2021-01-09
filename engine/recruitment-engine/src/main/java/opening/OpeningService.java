package opening;

import java.util.List;

public interface OpeningService {
  
  public Opening registerOpening(Opening opening);
  public Opening updateOpening(Opening opening);
  public List<Opening> listOpening();
  public void deleteOpening(Opening opening);
  public Opening getOpening(OpeningSeachCriteria searchCriteria);
  // submitOpeningToWorkflow();
  // receiveApproval();
  // // as organization, I would like to expire an opening once the required
  // fulfillment date is over
  // publishOpening();
  // expireOpening();
  

}
