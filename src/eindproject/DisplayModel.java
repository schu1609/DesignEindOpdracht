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
    private Controller controller;
    private int calculationValue;
    /*
    In deze class zit alvast een voorproefje van een lambda. Deze
    lambda maakt het mogelijk om op simpele wijze het programma
    zo te veranderen dat het een andere wiskundige operatie
    gaat doen. Dit werkt via de interface MathOperation.
    */
    
    MathOperation operation;
    
    public DisplayModel(MathOperation operation) {
        this.operation = operation;
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
        for(int i =0; i<controller.GetData().size();i++){
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
}
