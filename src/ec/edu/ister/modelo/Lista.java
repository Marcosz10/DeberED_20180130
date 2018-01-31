/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author ariel
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public void agregarInicio(int info) {
        Nodo nuevo = new Nodo(info, inicio);

        if (inicio == null) {
            inicio = fin = nuevo;
        }

        inicio = nuevo;

    }

    public void agregarFin(int info) {
        Nodo nuevo = new Nodo(info, null);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;

        }
    }

    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void eliminarNodo(int info) {
        if (inicio != null) {
            if (inicio == fin && inicio.getDato() == info) {
                inicio = fin = null;
            } else {
                if (inicio.getDato() == info) {
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo anterior = inicio;
                    Nodo siguiente = inicio.getSiguiente();

                    while (siguiente != null && siguiente.getDato() != info) {
                        anterior = siguiente;
                        siguiente = siguiente.getSiguiente();
                    }

                    if (siguiente != null) {
                        anterior.setSiguiente(siguiente.getSiguiente());
                        if (siguiente == fin) {
                            fin = anterior;
                        }
                    }
                }
            }
        }
    }

    public int[] obtenerDato() {
        Nodo recorre = inicio;
        int dato[] = new int[6];

        for (int i = 0; i < dato.length; i++) {
            dato[i] = recorre.getDato();
            recorre = recorre.getSiguiente();
        }
        return dato;

    }

    public void insertarValorAbsoluto(int buscar) {
        Nodo aux = inicio;

        while (aux != null) {

            if (aux.getDato() == buscar) {
                insertar(aux, aux.getSiguiente());
                return;
            }

            aux = aux.getSiguiente();
        }

    }

    public void insertar(Nodo aux, Nodo aux2) {
        Nodo nuevo = new Nodo(Math.abs(aux.getDato() - aux2.getDato()));
        aux.setSiguiente(nuevo);
        nuevo.setSiguiente(aux2);
    }

}

