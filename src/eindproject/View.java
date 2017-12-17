package eindproject;

import javax.swing.*;

/**
 * @author Brave
 */
// Wij hebben hier gebruik gemaakt van het Design pattern abstract factory. Deze word gebruikt als er iets word aangepast in de view of graph
public abstract class View extends JFrame {
    public abstract void initUI();

    public abstract void updateUI(Model model);
}