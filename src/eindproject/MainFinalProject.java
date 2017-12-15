/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

/**
 *
 * @author Brave
 */
public class MainFinalProject {
    private static Controller controller;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DisplayModel displayModel = new DisplayModel(controller);

        
        Display display1 = new AddMovieDisplay();
        Display display2 = new ListMovieDisplay();
        Display display3 = new GraphMovieDisplay();
        
        //CalcView calcView = new CalcButtonsView();
        
        controller = new Controller(displayModel, display1, display2, display3);
    }
}
