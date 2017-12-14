/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.List;
import java.util.Observable;

public class DisplayModel extends Observable {
    private Controller controller;
    List <String> names;
    List <String> origins;
    List <String> budgets;
    List <String> dates;
    
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
    
    public List <String> getNameList(){
        for(int i =0; i<controller.getData().size(); i++){
                names.add(controller.getData().get(i).getName());
            }
        return names;
    }
    
    public List <String> getOriginList(){
        for(int i =0; i<controller.getData().size(); i++){
                origins.add(controller.getData().get(i).getName());
            }
        return origins;
    }
    
    public List <String> getBudgetList(){
        for(int i =0; i<controller.getData().size(); i++){
                budgets.add(controller.getData().get(i).getName());
            }
        return budgets;
    }
    
    public List <String> getDateList(){
        for(int i =0; i<controller.getData().size(); i++){
                dates.add(controller.getData().get(i).getName());
            }
        return dates;
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
