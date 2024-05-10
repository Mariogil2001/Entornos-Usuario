package es.uv.eu.view;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

import es.uv.eu.model.FruitMachineModel;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class PanelSaldo extends JPanel {

    private JLabel saldo;
    private JButton aumentarSaldo;
    private JButton retirarSaldo;
    FruitMachineModel model;
    
    public PanelSaldo(FruitMachineModel model){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        saldo = new JLabel("Saldo: ");
        aumentarSaldo = new JButton("Añadir saldo");
        retirarSaldo = new JButton("Retirar saldo");

        aumentarSaldo.setActionCommand("aumentarSaldo");
        retirarSaldo.setActionCommand("retirarSaldo");


        add(saldo);
        add(aumentarSaldo);
        add(retirarSaldo);
    }

    public void setModelo(FruitMachineModel model){
        this.model = model;
    }
    
    public void setSaldo(int saldoValue){
        saldo.setText("Saldo: " + saldoValue);
    }

    public void setActionListener(ActionListener listener){
        aumentarSaldo.addActionListener(listener);
        retirarSaldo.addActionListener(listener);
    }
}
