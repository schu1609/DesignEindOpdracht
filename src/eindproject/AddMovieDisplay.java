package eindproject;

import javax.swing.*;

/**
 * @author Brave
 */
public class AddMovieDisplay extends View {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton addMovieButton;
    private JPanel panel1;

    /**
     * Creates new form AddMovieDisplay
     */
    AddMovieDisplay() {
        initUI();
    }

    @Override
    public void initUI() {
        setTitle("Add movie");
        setSize(536, 380);
        setVisible(true);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 500);
    }

    public void setAdd(AbstractAction action) {
        addMovieButton.setAction(action);
        addMovieButton.setText("Add movie");
    }

    @Override
    public void updateUI(Model model) {

    }

    public void clear() {
        textField1.setText("");
        textField2.setText("");
        comboBox1.setSelectedIndex(-1);
        textField4.setText("");
    }

    public MovieData getMovie() {
        return new MovieData(getName(), getYear(), getOrigin(), getBudget());
    }

    public String getName() {
        return textField1.getText();
    }

    private int getYear() {
        return Integer.parseInt(textField2.getText());
    }

    private String getOrigin() {
        return (String) comboBox1.getSelectedItem();
    }

    private double getBudget() {
        return Integer.parseInt(textField4.getText());
    }
}
