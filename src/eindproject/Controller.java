/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

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
    private AddMovieDisplay addMovieDisplay;
    private ListMovieDisplay listMovieDisplay;
    private GraphMovieDisplay graphMovieDisplay;
   
    public Controller(DisplayModel displayModel, AddMovieDisplay addMovieDisplay, ListMovieDisplay listMovieDisplay, GraphMovieDisplay graphMovieDisplay) {
        this.displayModel = displayModel;
        this.listMovieDisplay = listMovieDisplay;        
        this.addMovieDisplay = addMovieDisplay;
        this.graphMovieDisplay = graphMovieDisplay;
        this.displayModel.addObserver(this);
        this.listMovieDisplay.setVisible(true);
        this.addMovieDisplay.setVisible(true);
        this.graphMovieDisplay.setVisible(true);
        
        this.addMovieDisplay.setAdd(new AddAction());
        this.listMovieDisplay.setRemove(new RemoveAction());
    }
    
    @Override
    public void update(Observable o, Object arg) {
     listMovieDisplay.updateList(displayModel.getMovies());
     addMovieDisplay.clear();
     System.out.println("Done");
    }
    
    class AddAction extends AbstractAction {
        
        @Override
        public void actionPerformed(ActionEvent e){
            String MovieName = addMovieDisplay.getName();
            int MovieYear = addMovieDisplay.getYear();
            String MovieOrigin = addMovieDisplay.getOrigin();
            int MovieBudget = addMovieDisplay.getBudget();
            String Update = MovieName + " Added Movie";
            
            MovieData movie = new MovieData(MovieName, MovieYear, MovieOrigin, MovieBudget);
            displayModel.Add(movie);
            addMovieDisplay.update(Update);
        }
    }
    
    class RemoveAction extends AbstractAction {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String MovieName = listMovieDisplay.getSelectedMovie();
            if ( MovieName != null ){
                displayModel.Remove(MovieName);
            }
        }
    }
}
//    
//    public void addStartMovie(){
//        movies.add(new MovieData("Norm Of The North","North Pole",18000000,"January 5th 2016"));
//        movies.add(new MovieData("Lazer Team","America",2400000,"January 27th 2016"));
//        movies.add(new MovieData("Fan4stic","America",155000000,"Agust 6th 2015"));
//        movies.add(new MovieData("Epic Movie","America",20000000,"January 26th 2007"));
//        movies.add(new MovieData("Léon","France",16000000,"February 23rd 1994"));
//        movies.add(new MovieData("Tortilla Heaven","Mexico",10000000,"March 16th 2007"));
//        movies.add(new MovieData("Kameleon","Netherlands",7500000,"June 25th 2003"));
//        movies.add(new MovieData("Sinterklaas en het gouden hoefijzer","Netherlands",96882,"October 11th 2017"));
//    }
    
//    public List<MovieData> getData(){
//        return movies;
//    }
//    
//    public void AddToList(MovieData f){
//        movies.add(f);
//        //Hier komt de lijst van de display
//        //movieList.add(displayModel);
//    }
//
//    @Override
//    public void update(Observable o, Object arg) {
//        listMovieDisplay.updateList(displayModel.getMovies());
//        addMovieDisplay().Clear();
//    }
//    
//    class RemoveAction extends AbstractAction {
//        
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String MovieName = listMovieDisplay.getSelectedMovie();
//            if ( MovieName != null ){
//                displayModel.Remove(MovieName);
//            }
//        }
//    }
//    
//    class AddAction extends AbstractAction {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try{
//                String OriginMovie = display1.getOriginMovie();
//                String MovieName = display1.getMovieName();
//                int YearMovie = display1.getYearMovie();
//                int BudgetMovie = display1.getBudgetMovie();
//            
//                
//                MovieData myNewMovie = new MovieData(MovieName,OriginMovie,BudgetMovie,Integer.toString(YearMovie));
//                
//                int index = displayModel.getNameList().size();
//                
//                if(index == -1){
//                    index = 0;
//                } else{
//                    index++;
//                }
//                
//                //Hieronder voeg je hem toekomstig toe aan de lijst met de index die hierboven bepaald wordt.
//                //displayModel.listModel.insertElementAt(myNewMovie, index);
//                
//            }
//            catch(Exception ex){
//                System.out.println("Error, one of the input values was incorrect");
//            }
//            
//        }
//        
//    }
//}
