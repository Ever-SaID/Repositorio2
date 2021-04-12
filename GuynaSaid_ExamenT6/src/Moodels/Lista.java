package Moodels;

import java.util.ArrayList;

public class Lista<T> {

	// ATRIBUTOS
	private ArrayList<T> elementos;
	private int index;

	// CONSTRUCTOR VACÍO
	public Lista() {
		this.elementos = new ArrayList();
		this.index = 0;
	}




	// MÉTODOS
	public void add(T element) {
		this.elementos.add(element);
	}

	/*
	 * Metodo que Devolverá el elemento siguiente al que apunte el
      index.  
	 */
	public T getNext() {

		return elementos.get(index++);

	}
     /*
      * Metodo que Devolverá el elemento anterior al que apunte el
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
	 * Establece el índice a i siempre y cuando la lista
       admita ese índice por tamaño.
       En caso contrario devuelve-1. En caso de éxito devuelve i.
       @paramentro un numero entero
	 */
	public int setIndex(int i) {
        if(elementos.size()>i) {
        	return this.index = i;
        	
        }
		return -1;
		
	}
   
	/*
	 * Eliminará del array el elemento (si existe).
      Evidentemente habrá que redimensionar el array al
       tamaño real. Posiciona index al elemento anterior al
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
