package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    private Nodo actual;
    private int len;

    private class Nodo {
        Nodo anterior;
        T elem;
        Nodo siguiente;

        public Nodo(T e) {  
            elem = e;  
        }
    }

    public ListaEnlazada() {
       actual = null;
    }

    public int longitud() {
        return len;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevoNodo = new Nodo(elem);

        nuevoNodo.siguiente = actual;
        actual = nuevoNodo;

        len++;
    }

    public void agregarAtras(T elem) {
        //actual = (1,3,null)
        Nodo nuevoNodo = new Nodo(elem);
        //nuevoNodo = (null, 2, null)
        if (actual == null) {
            actual = nuevoNodo;
        } else {
            //actual = (1,3,null)
            //nuevoNodo = (null, 2, null)
            Nodo cache = actual;
            //cache = (1,3,null) = actual
            //nuevoNodo = (null, 2, null)

            while (cache.siguiente != null) {
                cache = cache.siguiente;
            }
            cache.siguiente = nuevoNodo;
            //cache = (1,3,2) = actual
            //nuevoNodo = (null, 2, null)
            nuevoNodo.anterior = cache;
            //cache = (1,3,2)
            //nuevoNodo = (3, 2, null)
        }

        len++;
    }

    public T obtener(int i) {
        Nodo cache = actual;
        // Pre ≡ 0 ≤ i < len
        // 0 ≤ j < i ∧ cache = cache.siguiente
        for (int j = 0; j < i; j++) {
            cache = cache.siguiente;
        }

        return cache.elem;
    }

    public void eliminar(int i) {
        Nodo cache = actual;
        Nodo ant = null;

        for (int j = 0; j < i; j++) {
            ant = cache;
            cache = cache.siguiente;
        }

        if (i == 0) {
            actual = cache.siguiente;
        } else {
            ant.siguiente = actual;
        }
    }

    public void modificarPosicion(int indice, T elem) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada<T> copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        throw new UnsupportedOperationException("No implementada aun");
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados

        public boolean haySiguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        
        public boolean hayAnterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }

        public T siguiente() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
        

        public T anterior() {
	        throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
	    throw new UnsupportedOperationException("No implementada aun");
    }

}
