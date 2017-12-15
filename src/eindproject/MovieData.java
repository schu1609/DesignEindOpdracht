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
public class MovieData {
    String movieName;
    int movieYear;
    String movieOrigin;
    int movieBudget;
    
    //wij hebben hier het Design Pattern Constructor Chaining gebruikt, omdat: voor sommige films die nog uit moeten komen weten mensen niet alle data er over.
    public MovieData(String movieName,int movieYear ,String movieOrigin ,int movieBudget){
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieOrigin = movieOrigin;
        this.movieBudget = movieBudget;
    }
    
    public MovieData(String movieName,int movieYear ,String movieOrigin ){
        this.movieName = movieName;
        this.movieYear = movieYear;      
        this.movieOrigin = movieOrigin;
    }
    
    public MovieData(String movieName,int movieYear ,int movieBudget){
        this.movieName = movieName;     
        this.movieYear = movieYear;
        this.movieBudget = movieBudget;
    }
    
    public MovieData(String movieName,int movieYear ){
        this.movieName = movieName;
        this.movieYear = movieYear;
    }
    
    public String getName(){
        return movieName;
    }
    
    public int getYear(){
        return movieYear;
    }
    public String getOrigin(){
        return movieOrigin;
    }
    public int getBudget(){
        return movieBudget;
    }
}
