package eindproject;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphMovieDisplay extends View {

    private ChartPanel panel1;
    private DefaultCategoryDataset data = new DefaultCategoryDataset();
    private JFreeChart chart;

    /**
     * Creates new form GraphMovieDisplay
     */
    GraphMovieDisplay() {
        initUI();
    }

    @Override
    public void initUI() {
        chart = ChartFactory.createBarChart("Movie Origin", "", "How many movies", data, PlotOrientation.VERTICAL, true, true, true);
        panel1 = new ChartPanel(chart);
        setTitle("Movie origin chart");
        setSize(536, 380);
        setVisible(true);
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(1072, 500);
    }

    @Override
    public void updateUI(Model model) {
        data.clear();
        List<MovieData> movies = model.getMovies();
        Map<String, Integer> originCounts = new HashMap<>();
        for (MovieData movie : movies) {
            String origin = movie.getOrigin();
            int count = originCounts.getOrDefault(origin, 0);
            originCounts.put(origin, count + 1);
        }
        for (Map.Entry<String, Integer> entry : originCounts.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            data.addValue(value, "How many movies", key);
        }
    }
}