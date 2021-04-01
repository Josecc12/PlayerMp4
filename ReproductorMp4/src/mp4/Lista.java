/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp4;

import javax.swing.JOptionPane;

/**
 *
 * @author RQ550LF
 */
public class Lista {
    
    private Nodo frente;
    private Nodo fondo;
    private int tamanio;
    
    
    public void Lista(){ 
        this.frente = null;
        this.fondo = null;
        this.tamanio = 0; 
    }
    
    public int get_tamanio(){ 
        return this.tamanio;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }
    
    public boolean esVacia(){ 
       return frente == null;
    }
    
    public void Insertar_Nodo(Video video){ 
        
       Nodo nuevo = new Nodo(video);
     
       
       if(esVacia()){ 
          frente = nuevo;
          fondo = nuevo;
          
          
       }
       else{ 
           fondo.setSiguiente(nuevo);
           nuevo.setAnterior(fondo);
           fondo = nuevo; 
       }
       
       
       tamanio++; 
    }
    
   
    public Nodo Buscar(String valor, Nodo actual){ 
        if(actual != null){ 
            if(valor == actual.getVideo().getTitulo()){ 
                return actual;
            }
            else{ 
                return Buscar(valor, actual.getSiguiente());
            }       
        }
        
        return null; 
    }
    
    public Nodo return_siguient(Nodo actual){ 
        if(actual.getSiguiente() == null){ 
            return frente;
        }
        else{ 
            return actual.getSiguiente();
        }
    }
    
    public Nodo return_anterior(Nodo actual){ 
        if(actual.getAnterior() == null){ 
            return fondo;
        }
        else{ 
            return actual.getAnterior(); 
        }
    }
    
    public Nodo buscarRandom(int random, Nodo aux) {
        Nodo resultado = this.frente;
        int contador = 1;
        while (contador != random) {
            resultado = resultado.getSiguiente();
            contador++;
        }
        return resultado;
    }
}
