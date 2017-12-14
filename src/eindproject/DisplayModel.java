/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.List;
import java.util.Observable;
public class DisplayModel extends Observable {
    private final Controller controller;
    
    public DisplayModel(Controller controller) {
        this.controller = controller;
    }
    
    public boolean dataExists(MovieData movie){
        for(int i =0; i<controller.getData().size(); i++){
            if(movie.equals(controller.getData().get(i))){
                return true;
            }
        }
        return false;
    }
    
    public void addMovie(MovieData movie){
        controller.getData().add(movie);
    }
    
    public void removeMovie(MovieData movie){
        if(controller.getData().contains(movie)){
            controller.getData().remove(movie);   
        }
    }
}
