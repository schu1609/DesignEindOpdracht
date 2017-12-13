/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javax.swing.AbstractAction;

import java.util.Observer;
/**
 *
 * @author Brave
 */
class Controller implements Observer {
    private DisplayModel displayModel;
    private Display displayView;
    
    private Display[] display;
    private MovieData[] movieData;
    
    private List <MovieData> movies = new ArrayList<MovieData>();
    
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
    public List<MovieData> GetData(){
        return movies;
    }
    
    
    public Controller(DisplayModel displayModel, Display displayView) {
        this.displayModel = displayModel;
        this.displayView = displayView;
        
        this.displayView.GetData();
        
        this.displayModel.addObserver(this);
        
        displayView.setVisible(true);
    }
    
     public void GetData(boolean DataRecieved) {

    }

    @Override
    public void update(Observable o, Object arg) {
        displayView.setResult(displayModel.getCalculationValue());
    }
}
