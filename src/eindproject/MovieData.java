/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

/**
 *
 * @author Thefellowes
 */
public class MovieData {
    String name;
    int year;
    String origin;
    double budget;
    
    MovieData(String name, int year, String origin, double budget){
        this.name = name;
        this.year = year;
        this.origin = origin;
        this.budget = budget;
    }
}
