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
 * @author Thefellowes
 */
public class Display {
    public MovieData showMovie(){
        List<MovieData>movies = Controller.getMovies();
        for(MovieData m : movies){
            return m;
        }
    }
}
