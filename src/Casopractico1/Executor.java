package Casopractico1;

public class Executor {
	//La Clase "Executor", ejecutará su porpio constructor	

	public static void main(String[]args) {
		
		new Executor(); 
		
	}
	public Executor( ) {
		
		// El constructor ahora ejecutará la clase RelojDigital
	
			new RelojDigital();
			
	}	
		
	}
