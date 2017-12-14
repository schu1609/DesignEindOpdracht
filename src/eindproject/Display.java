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

//Wij hebben hier gebruik gemaakt van het Design pattern Abstractie, omdat: wij hierdoor data kunnen gebruiken in een Jframe.
public abstract class Display extends javax.swing.JFrame {
    public abstract void GetData();
    public abstract String getOriginMovie();
    public abstract void setAddAction(AbstractAction action);   
    public abstract String getMovieName();
    public abstract int getYearMovie();
    public abstract int getBudgetMovie();
    
}