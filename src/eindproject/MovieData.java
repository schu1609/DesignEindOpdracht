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
    
    //wij hebben hier het Design Pattern Constructor Chaining gebruikt, omdat: voor sommige films die nog uit moeten komen weten mensen niet alle data er over.
    public MovieData(String naam,String origin,int budget,String date){
        this.naam = naam;
        this.origin = origin;
        this.budget = budget;
        this.date = date;
    }
    
    public MovieData(String naam,String origin,String date){
        this.naam = naam;
        this.origin = origin;      
        this.date = date;
    }
    
    public MovieData(String naam,int budget,String date){
        this.naam = naam;     
        this.budget = budget;
        this.date = date;
    }
    
    public MovieData(String naam,String date){
        this.naam = naam;
        this.date = date;
    }
    
    public String getName(){
        return naam;
    }
    //getName = () -> naam;
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
