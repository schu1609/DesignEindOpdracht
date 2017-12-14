/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.util.Observable;
import javax.swing.AbstractAction;

import java.util.Observer;
/**
 *
 * @author Brave
 */

class Controller implements Observer {
    private DisplayModel displayModel;
    private Display display;
    
    private List <MovieData> movies;
   
    public Controller(DisplayModel displayModel, Display displayView) {
        this.displayModel = displayModel;
        this.display = displayView;        
        this.display.GetData();
        
        this.displayModel.addObserver(this);
        
        displayView.setAddAction(new AddAction());
        
        displayView.setVisible(true);
    }
    
    public void addStartMovie(){
        movies.add(new MovieData("Norm Of The North","North Pole",18000000,"January 5th 2016"));
        movies.add(new MovieData("Lazer Team","America",2400000,"January 27th 2016"));
        movies.add(new MovieData("Fan4stic","America",155000000,"Agust 6th 2015"));
        movies.add(new MovieData("Epic Movie","America",20000000,"January 26th 2007"));
        movies.add(new MovieData("Léon","France",16000000,"February 23rd 1994"));
        movies.add(new MovieData("Tortilla Heaven","Mexico",10000000,"March 16th 2007"));
        movies.add(new MovieData("Kameleon","Netherlands",7500000,"June 25th 2003"));
        movies.add(new MovieData("Sinterklaas en het gouden hoefijzer","Netherlands",96882,"October 11th 2017"));
    }
    
    public List<MovieData> getData(){
        return movies;
    }
    
//FIND USE FOR THIS.
    @Override
    public void update(Observable o, Object arg) {
     //   displayView.setResult(1);
    }
    
    class AddAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            String OriginMovie = display.getOriginMovie();
            String MovieName = display.getMovieName();
            int YearMovie = display.getYearMovie();
            int BudgetMovie = display.getBudgetMovie();
            
            movies.add(new MovieData(MovieName,OriginMovie,BudgetMovie,Integer.toString(YearMovie)));
        }
        
    }
}
