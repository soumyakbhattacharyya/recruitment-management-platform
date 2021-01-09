package opening;

import java.util.List;

import com.google.inject.Inject;

public class OpeningServiceImpl implements OpeningService{
  
  @Inject
  private OpeningRepository repository;

  @Override
  public Opening registerOpening(Opening opening) {
    if (null != repository) {System.out.println("it works!");}
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Opening updateOpening(Opening opening) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Opening> listOpening() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteOpening(Opening opening) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Opening getOpening(OpeningSeachCriteria searchCriteria) {
    // TODO Auto-generated method stub
    return null;
  }
  
  public static void main(String[] args) {
    OpeningServiceImpl serviceImpl = new OpeningServiceImpl();
    serviceImpl.registerOpening(null);
  }

}
