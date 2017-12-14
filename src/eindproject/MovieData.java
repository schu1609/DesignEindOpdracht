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
    String naam;
    String origin;
    int budget;
    String date;
    
    public MovieData(String naam,String origin,int budget,String date){
        this.naam = naam;
        this.origin = origin;
        this.budget = budget;
        this.date = date;
    }
    
    public String getName(){
        return naam;
    }
    public String getOrigin(){
        return origin;
    }
    public String getBudget(){
        return Integer.toString(budget);
    }
    public String getDate(){
        return date;
    }
}
