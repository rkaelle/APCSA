public class Bus
{
  int currentStop = 1;
  int numStops;

public Bus(int numStops){
    
    this.currentStop = currentStop;
    this.numStops = numStops;
  }
  public void move(){
    if ((currentStop + 1)>(numStops)){
      currentStop = 1;
    } else{
      currentStop = currentStop +1;
    }
  }
  public int getCurrentStop(){
    return currentStop;
  }
  public void setCurrentStop(int currentStop){
    this.currentStop = currentStop;
  }
  public int getNumStops() {
	return numStops;
}
public void setNumStops(int numStops) {
	this.numStops = numStops;
}
}
