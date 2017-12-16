package eindproject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Brave
 */
class Controller implements Observer {
    private Model model;
    private AddMovieDisplay addMovieDisplay;
    private ListMovieDisplay listMovieDisplay;
    private GraphMovieDisplay graphMovieDisplay;

    Controller(Model model, AddMovieDisplay addMovieDisplay, ListMovieDisplay listMovieDisplay, GraphMovieDisplay graphMovieDisplay) {
        this.model = model;
        this.listMovieDisplay = listMovieDisplay;
        this.addMovieDisplay = addMovieDisplay;
        this.graphMovieDisplay = graphMovieDisplay;
        this.model.addObserver(this);
        this.listMovieDisplay.setVisible(true);
        this.addMovieDisplay.setVisible(true);
        this.graphMovieDisplay.setVisible(true);

        this.addMovieDisplay.setAdd(new AddAction());
        this.listMovieDisplay.setRemove(new RemoveAction());

        this.listMovieDisplay.updateUI(model);
        this.graphMovieDisplay.updateUI(model);
    }

    // Observable pattern.
    @Override
    public void update(Observable o, Object arg) {
        listMovieDisplay.updateUI(model);
        graphMovieDisplay.updateUI(model);
        addMovieDisplay.clear();
        System.out.println("Done");
    }

    class AddAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            MovieData movie = addMovieDisplay.getMovie();
            model.add(movie);
            graphMovieDisplay.updateUI(model);
        }
    }

    class RemoveAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            String movieName = listMovieDisplay.getSelectedMovie();
            if (movieName != null) {
                model.remove(movieName);
            }
        }
    }

    public Model getData() {
        return model;
    }
}
