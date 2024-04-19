package es.uv.eu.photoeditor.view;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class StatusPanel extends JPanel {
    private JLabel lineWidthLabel;
    private JLabel borderColorLabel;
    private JLabel backgroundColorLabel;

    public StatusPanel() {
        lineWidthLabel = new JLabel();
        borderColorLabel = new JLabel();
        backgroundColorLabel = new JLabel();

        add(lineWidthLabel);
        add(borderColorLabel);
        add(backgroundColorLabel);
    }

    public void setLineWidth(int lineWidth) {
        lineWidthLabel.setText("Line Width: " + lineWidth);
    }

    public void setBorderColor(String borderColor) {
        borderColorLabel.setText("Border Color: " + borderColor);
    }

    public void setBackgroundColor(String backgroundColor) {
        backgroundColorLabel.setText("Background Color: " + backgroundColor);
    }
}