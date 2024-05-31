package es.uv.eu.fruit_machine.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import es.uv.eu.fruit_machine.model.FruitMachineModel;
import java.util.ArrayList;

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
    
        textArea.setText(""); // Clear the text area
    
        for (int i = 0; i < nombres.size(); i++) {
            int puntuacion = (puntuaciones != null && i < puntuaciones.size()) ? puntuaciones.get(i) : 0;
            textArea.append(nombres.get(i) + ": " + puntuacion + "\n");
        }
    }
}