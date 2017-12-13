/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import javax.swing.AbstractAction;

/**
 *
 * @author Brave
 */
public abstract class Display extends javax.swing.JFrame {
    public abstract void GetData();
    public abstract int getFirstNumber();
    public abstract int getSecondNumber();
    public abstract void setResult(int result);
    public abstract void setAddAction(AbstractAction action);
    
    private Controller controller = new Controller();
    private List <MovieData> moviedata;
    
    public void GetData(){
        moviedata = controller.GetData();
    }
    
    public boolean DataExists(MovieData movie){
        boolean bool = false;
        for(int i =0; i<moviedata.size();i++){
            if(movie.equals(moviedata.get(i))){
                bool = true;
            }
        }
        return bool;
    }
    
    public void addMovie(MovieData movie){
        moviedata.add(movie);
    }
    
    public void removeMovie(MovieData movie){
        if(moviedata.contains(movie)){
            moviedata.remove(movie);   
        }
    }
}
