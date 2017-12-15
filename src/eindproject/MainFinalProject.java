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
        
        Model displaymodel = new Model();
        AddMovieDisplay addMovieDisplay = new AddMovieDisplay();
        ListMovieDisplay listMovieDisplay = new ListMovieDisplay();
        GraphMovieDisplay graphMovieDisplay = new GraphMovieDisplay();
        
        controller = new Controller(displaymodel, addMovieDisplay, listMovieDisplay, graphMovieDisplay);
    }
}
