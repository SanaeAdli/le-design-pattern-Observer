public class OctalObserver implements Observer{
	
	public void update(Subject subject){
	int state =((OctalObserver)subject).getState();
	 String str = Integer.toOctalString(state);
	 System.out.println("L'affichage en  Octal est : "+str);
	}
}
