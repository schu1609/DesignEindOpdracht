package eindproject;

import javax.swing.*;


public class AddMovieDisplay extends View {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton addMovieButton;
    private JPanel panel1;
    private JLabel JLabelError;

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
        JLabelError.setVisible(false);
        comboBox1.setSelectedIndex(-1);
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

    public MovieData getMovie()
    {
        try {
            JLabelError.setVisible(false);
            if (getOrigin() == null && textField4.getText().equals(""))
                return new MovieData(getName(), getYear());
            else if (textField4.getText().equals(""))
                return new MovieData(getName(), getYear(), getOrigin());
            else if (getOrigin() == null)
                return new MovieData(getName(), getYear(), getBudget());
            return new MovieData(getName(), getYear(), getOrigin(), getBudget());
        }
        catch (Exception ex)
        {
            JLabelError.setVisible(true);
            return null;
        }
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
        return Double.parseDouble(textField4.getText());
    }
}
