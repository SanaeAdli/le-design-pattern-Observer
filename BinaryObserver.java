public class BinaryObserver implements Observer{
	
	public void update(Subject subject){
	int state =((BinaryObserver)subject).getState();
	 String str = Integer.toBinaryString(state);
	 System.out.println("L'affichage en binaire est : "+str);
	}
}