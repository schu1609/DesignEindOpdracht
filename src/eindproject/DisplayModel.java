/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.Observable;
/**
 *
 * @author Brave
 */
public class DisplayModel extends Observable {
    private int calculationValue;
    private final Controller controller;
    MathOperation operation;
    
    public DisplayModel( Controller controller) {      
        this.controller = controller;
    }
    
    public void addTwoNumbers(int a, int b) {
        calculationValue = operate(a, b, operation);
        
        setChanged();
        notifyObservers();
    }
    
    public int getCalculationValue() {
        return calculationValue;
    }
    
    private int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
    
    public interface MathOperation {
        int operation(int a, int b);
    }
    
    public boolean DataExists(MovieData movie){
        for(int i =0; i<controller.GetData().size(); i++){
            if(movie.equals(controller.GetData().get(i))){
                return true;
            }
        }
        return false;
    }
    
    public void addMovie(MovieData movie){
        controller.GetData().add(movie);
    }
    
    public void removeMovie(MovieData movie){
        if(controller.GetData().contains(movie)){
            controller.GetData().remove(movie);   
        }
    }
    //
}
