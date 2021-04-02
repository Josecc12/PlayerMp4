/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp4;

import java.io.Serializable;

/**
 *
 * @author RQ550LF
 */
public class Video  implements Serializable{
    
    private String titulo;
    private String enlace;
    
    public  Video(){ 
        
        this.enlace="";
        this.titulo="";
    }
    
     public  Video(String enlace, String titulo){ 
        
        this.enlace=enlace;
        this.titulo=titulo;
    }
 
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 

    /**
     * @return the enlace
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
    
    
}
