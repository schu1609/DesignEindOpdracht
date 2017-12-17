package eindproject;


public class Main {
    private static Controller controller;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        AddMovieDisplay addMovieDisplay = new AddMovieDisplay();
        ListMovieDisplay listMovieDisplay = new ListMovieDisplay();
        GraphMovieDisplay graphMovieDisplay = new GraphMovieDisplay();

        controller = new Controller(model, addMovieDisplay, listMovieDisplay, graphMovieDisplay);
    }
}
