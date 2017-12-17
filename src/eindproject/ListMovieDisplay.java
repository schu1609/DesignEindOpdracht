package eindproject;

import javax.swing.*;
import java.util.List;

/**
 * @author Brave
 */
public class ListMovieDisplay extends View {
    private JList<String> list1;
    private JButton removeButton;
    private JPanel panel1;

    /**
     * Creates new form ListMovieDisplay
     */
    ListMovieDisplay() {
        initUI();
    }

    @Override
    public void initUI() {
        setTitle("List movies");
        setSize(536, 380);
        setVisible(true);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(536, 500);
    }

    @Override
    public void updateUI(Model model) {
        List<MovieData> movies = model.getMovies();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        if (!movies.isEmpty()) {
            for (MovieData movie : movies) {
                listModel.addElement(movie.getName()+" , "+movie.getYear()+" , "+movie.getOrigin()+" , "+movie.getBudget());
            }
        }
        list1.setModel(listModel);
    }

    public void setRemove(AbstractAction action) {
        removeButton.setAction(action);
        removeButton.setText("Remove Movie");
    }

    public String getSelectedMovie() {
        int index = list1.getSelectedIndex();
        String MovieName = list1.getSelectedValue();
        return index == -1 ? null : MovieName;
    }
}
