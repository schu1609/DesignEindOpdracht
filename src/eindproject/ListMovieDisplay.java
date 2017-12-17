package eindproject;

import javax.swing.*;
import java.util.List;


public class ListMovieDisplay extends View {
    private JList<String> list1;
    private JList<Integer> list2;
    private JList<String> list3;
    private JList<Double> list4;
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
        DefaultListModel<Integer> listModel2 = new DefaultListModel<>();
        DefaultListModel<String> listModel3 = new DefaultListModel<>();
        DefaultListModel<Double> listModel4 = new DefaultListModel<>();
        if (!movies.isEmpty()) {
            for (MovieData movie : movies) {
                listModel.addElement(movie.getName());
                listModel2.addElement(movie.getYear());
                listModel3.addElement(movie.getOrigin());
                listModel4.addElement(movie.getBudget());
            }
        }
        list1.setModel(listModel);
        list2.setModel(listModel2);
        list3.setModel(listModel3);
        list4.setModel(listModel4);
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
