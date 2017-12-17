package eindproject;

import javax.swing.*;


// Wij hebben hier gebruik gemaakt van het Design pattern Abstractie, omdat: wij hierdoor data kunnen gebruiken in een Jframe.
public abstract class View extends JFrame {
    public abstract void initUI();

    public abstract void updateUI(Model model);
}