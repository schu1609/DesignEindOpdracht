/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.ArrayList;
import java.util.List;

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
}
