/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play_list;

/**
 *
 * @author RQ550LF
 */
public class Nodo {
    
    private Nodo siguiente;
    private Nodo anterior;
    private Video video;
    
    public Nodo(Nodo siguiente, Nodo anterior, Video video){ 
        this.setSiguiente(siguiente);
        this.setAnterior(anterior);
        this.setVideo(video);
        
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * @param video the video to set
     */
    public void setVideo(Video video) {
        this.video = video;
    }
    
    
    
}
