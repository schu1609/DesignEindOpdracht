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
        
        //Deze regel lijkt anders dan tijdens de les, dat klopt. Er zit
        //een voorproefje van een lambda functie in. Kijk in de class
        //CalcModel voor meer info.
        DisplayModel displayModel = new DisplayModel((int a, int b) -> a + b ,controller);
        
        //Kies hier een van de twee regels code om de andere
        //functionaliteit te activeren
        Display display = new ListMovieDisplay();
        //CalcView calcView = new CalcButtonsView();
        
        controller = new Controller(displayModel, display);
    }
}
