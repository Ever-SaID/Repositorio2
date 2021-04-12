package mainApp;

import java.util.Iterator;

import Moodels.Lista;

public class MainApp {

	public static void main(String[] args) {
		
		Lista<String> numeros =new Lista <String>();
		
		numeros.add("Uno");
		numeros.add("Dos");
		numeros.add("Tres");
		numeros.add("Cuatro");
		numeros.add("Cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		
	 System.out.println(numeros);
	
	 
	 System.out.println( numeros.getNext());
	 System.out.println( numeros.setIndex(7));
	 System.out.println( numeros.getCurrent());
	 System.out.println( numeros.getPrev());
	 System.out.println( numeros.getNext());
	 
	 
	 
	 
	 
		
		
	}

}
