public class hexaObserver implements Observer {
	
	public void update(Subject subject){
	int state =((hexaObserver)subject).getState();
	 String str = Integer.toHexString(state);
	 System.out.println("L'affichage en hexadécimal est : "+str);
	}
}