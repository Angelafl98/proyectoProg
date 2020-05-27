package com.listase.modelo;


public class NodoDE {
    private Infante dato;
    private NodoDE siguiente;
    private NodoDE anterior;

    public NodoDE(Infante dato) {
        this.dato = dato;
    }

    public Infante getDato() {
        return dato;
    }

    public void setDato(Infante dato) {
        this.dato = dato;
    }

    public NodoDE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDE siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDE anterior) {
        this.anterior = anterior;
    }
    
    
    
}