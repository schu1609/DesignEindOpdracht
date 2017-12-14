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
    public abstract String getOriginMovie();
    public abstract void setAddAction(AbstractAction action);
    interface Optional{
            public abstract String getMovieName();
            public abstract int getYearMovie();
            public abstract int getBudgetMovie();
    }
}