package es.uv.eu.fruit_machine.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import es.uv.eu.fruit_machine.model.FruitMachineModel;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RankingView extends JFrame {

    private JTextArea textArea;

    public RankingView() {
        setTitle("Ranking");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
    }

public void updateRanking(FruitMachineModel model) {
    ArrayList<String> nombres = model.getNombre();
    ArrayList<Integer> puntuaciones = model.getPuntuacion();

    // Create a list of name-score pairs
    List<SimpleEntry<String, Integer>> nameScorePairs = IntStream.range(0, nombres.size())
        .mapToObj(i -> new SimpleEntry<>(nombres.get(i), puntuaciones != null && i < puntuaciones.size() ? puntuaciones.get(i) : 0))
        .collect(Collectors.toList());

    // Sort the list in descending order by score
    nameScorePairs.sort((pair1, pair2) -> pair2.getValue().compareTo(pair1.getValue()));

    textArea.setText(""); // Clear the text area

    // Update the text area with the sorted name-score pairs
    for (SimpleEntry<String, Integer> pair : nameScorePairs) {
        textArea.append(pair.getKey() + ": " + pair.getValue() + "\n");
    }
}
}