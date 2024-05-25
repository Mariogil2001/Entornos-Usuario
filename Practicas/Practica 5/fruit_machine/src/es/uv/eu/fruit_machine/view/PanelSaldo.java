package es.uv.eu.fruit_machine.view;

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import es.uv.eu.fruit_machine.model.FruitMachineModel;
import es.uv.eu.fruit_machine.model.FruitMachineModel.Observer; // Importa la interfaz Observer correcta

public class PanelSaldo extends JPanel implements Observer {

    private JLabel saldo;
    private JButton aumentarSaldo;
    private JButton retirarSaldo;
    private FruitMachineModel model;
    
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

        this.model = model;
        this.model.addObserver(this); // Registra este panel como observador del modelo
        update(model);
        
    }

    public void setModelo(FruitMachineModel model){
        if (this.model != null) {
            this.model.removeObserver(this); // Elimina este panel como observador del modelo antiguo
        }
        this.model = model;
        this.model.addObserver(this); // Registra este panel como observador del nuevo modelo
        update(model);
    }
    
    @Override
    public void update(FruitMachineModel model) {
        saldo.setText("Saldo: " + model.getSaldo()); // Actualiza la etiqueta saldo con el saldo actual del modelo
    }

    public void setActionListener(ActionListener listener){
        aumentarSaldo.addActionListener(listener);
        retirarSaldo.addActionListener(listener);
    }

    
}