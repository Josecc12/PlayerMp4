/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play_list;

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
    
    public boolean esVacia(){ 
       return frente == null;
    }
    
    public void Insertar_Nodo(Video video){ 
        
       Nodo nuevo = new Nodo(null,null,video);
     
       
       if(esVacia()){ 
          frente = nuevo;
          fondo = nuevo;
          
          
       }
       else{ 
           fondo.setSiguiente(nuevo);
           fondo = nuevo;
           fondo.setAnterior(nuevo);
       }
       
       tamanio++; 
    }
    
    public void Mostar(){ 
        
        Nodo aux = frente;
        
        while(aux != null){ 
            JOptionPane.showMessageDialog(null,"Titulo: " +aux.getVideo().getTitulo() + 
                    "\nEnlace: " + aux.getVideo().getEnlace());
            aux = aux.getSiguiente();
        }
    }
}
