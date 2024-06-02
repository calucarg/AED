package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    private Nodo _raiz;
    private int _cardinal;

    private class Nodo {
        T valor;
        Nodo izq;
        Nodo der;
        Nodo padre;

        Nodo (T v) {
            valor =  v;
            izq = null;
            der = null;
            padre = null;
        }
    }

    public ABB() {
        _raiz = null;
        _cardinal = 0;
    }

    public int cardinal() {
        return _cardinal;
    }

    private Nodo minSearch(Nodo nodo) {
        if (nodo == null) {return null;}
        while (nodo.izq != null) {
            nodo = nodo.izq;
        }
        return nodo;
    }

    private Nodo maxSearch(Nodo nodo) {
        if (nodo == null) {return null;}
        while (nodo.der != null) {
            nodo = nodo.der;
        }
        return nodo;
    }

    public T minimo(){
        Nodo min = minSearch(_raiz);
        //si min es null entonces null, else min.valor
        return (min != null) ? min.valor : null;
    }

    public T maximo(){
        Nodo max = maxSearch(_raiz);
        return (max != null) ? max.valor : null;
    }

    private Nodo insertRec(Nodo nodo, T e) {
        if (pertenece(e)) {return nodo;}
    
        //caso base
        if (nodo == null) {
            return new Nodo(e);
        }
    
        int comparador = e.compareTo(nodo.valor);
    
        if (comparador < 0) {
            nodo.izq = insertRec(nodo.izq, e);
        } else if (comparador > 0) {
            nodo.der = insertRec(nodo.der, e);
        }
        
        return nodo;
    }
    public void insertar(T elem){
        //ver como implementar la recursión sobre el mismo método
        if(!pertenece(elem)) {
            _raiz = insertRec(_raiz, elem);
            _cardinal++;
        }
    }

    public boolean pertenece(T elem){
        Nodo p = _raiz;
        while (p != null) {
            if (elem.compareTo(p.valor) == 0) {
                return true;
            } else if (elem.compareTo(p.valor) < 0) {
                p = p.izq;
            } else {
                p = p.der;
            }
        }

        return false;

    }

    public void eliminar(T elem){
        if(pertenece(elem)) {
            _raiz = deleteRec(_raiz, elem);
            _cardinal--;
        }
    }

    private Nodo deleteRec(Nodo nodo, T e) {
        if (nodo == null) {return nodo;}

        if (e.compareTo(nodo.valor) < 0) {
            nodo.izq = deleteRec(nodo.izq, e);
        } else if (e.compareTo(nodo.valor) > 0) {
            nodo.der = deleteRec(nodo.der, e);
        } else {
            if (nodo.izq == null) {
                return nodo.der;
            } else if (nodo.der == null) {
                return nodo.izq;
            }
            // sabemos que el menor del lado derecho es > que el nodo a eliminar y todo a la izq
            Nodo reemplazo = minSearch(nodo.der);
            nodo.valor = reemplazo.valor;
            nodo.der = deleteRec(nodo.der, reemplazo.valor);
        }

        return nodo;
    }

    public String toString(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("{");
        inorder(_raiz, buffer);
        //borrarl a coma final
        if (buffer.length() > 1) {
            buffer.setLength(buffer.length() - 1);
        }
        buffer.append("}");
        return buffer.toString();
    }


    private void inorder(Nodo nodo, StringBuilder buffer) {
        if (nodo == null) {
            return;
        }
        inorder(nodo.izq, buffer);
        buffer.append(nodo.valor).append(",");
        inorder(nodo.der, buffer);
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;
        private Stack<Nodo> _pila;
        
        public ABB_Iterador() {
            _actual = _raiz;
            _pila = new Stack<Nodo>();
            while (_actual != null) {
                _pila.push(_actual);
                _actual = _actual.izq;
            }
        }

        public boolean haySiguiente() {            
            return !_pila.isEmpty();
        }
    
        public T siguiente() {
            if (haySiguiente()) {
                Nodo nodo = _pila.pop();
                T valor = nodo.valor;

                if (nodo.der != null) {
                    nodo = nodo.der;

                    while (nodo != null) {
                        _pila.push(nodo);
                        nodo = nodo.izq;
                    }
                }

                return valor;

            } else {return null;}
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
