package Moodels;

import java.util.ArrayList;

public class Lista<T> {

	// ATRIBUTOS
	private ArrayList<T> elementos;
	private int index;

	// CONSTRUCTOR VAC�O
	public Lista() {
		this.elementos = new ArrayList();
		this.index = 0;
	}




	// M�TODOS
	public void add(T element) {
		this.elementos.add(element);
	}

	/*
	 * Metodo que Devolver� el elemento siguiente al que apunte el
      index.  
	 */
	public T getNext() {

		return elementos.get(index++);

	}
     /*
      * Metodo que Devolver� el elemento anterior al que apunte el
       index.
      */
	public T getPrev() {
		return elementos.get(index - 1);
	}
	

	/*
	 * Metodo que devuelve el elemento actual al que apunte el index.
	 */
	public T getCurrent() {

		return elementos.get(index);
	}

	/*
	 * Establece el �ndice a i siempre y cuando la lista
       admita ese �ndice por tama�o.
       En caso contrario devuelve-1. En caso de �xito devuelve i.
       @paramentro un numero entero
	 */
	public int setIndex(int i) {
        if(elementos.size()>i) {
        	return this.index = i;
        	
        }
		return -1;
		
	}
   
	/*
	 * Eliminar� del array el elemento (si existe).
      Evidentemente habr� que redimensionar el array al
       tama�o real. Posiciona index al elemento anterior al
        borrado.
	 */
	public void remove(T element) {

		this.elementos.removeAll(elementos);
	}

	@Override
	public String toString() {
		return "Lista [elementos=" + elementos + ", index=" + index + "]";
	}

}
