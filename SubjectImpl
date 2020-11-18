public class SubjectImpl implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
    private int state;

	public void registre(Observer o){
      this.observers.add(o);
	}
	 public void unregister(Observer o){
    this.observers.remove(o);
	 }
    public void notifyObserver(){
      for (Observer o : observers) {
       o.update(this);
    }
        public Subject(int val) {
		this.setState(val);
	}
   
    public int getState(){
    return state;
    }
    public void setState(int state){
     this.state = state;
    notifyAllObservers();

    } 
}
