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
public class Video {
    
    private String titulo;
    private String enlace;
    
    public  Video(String titulo, String enlace){ 
        
        this.setTitulo(titulo);
        this.setEnlace(enlace); 
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