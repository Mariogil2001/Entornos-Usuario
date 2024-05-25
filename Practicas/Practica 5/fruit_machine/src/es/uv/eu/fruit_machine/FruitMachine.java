package es.uv.eu.fruit_machine;

import es.uv.eu.fruit_machine.view.FruitMachineView;
import es.uv.eu.fruit_machine.view.PanelPrincipalView;
import es.uv.eu.fruit_machine.controller.FruitMachineController;
import es.uv.eu.fruit_machine.model.FruitMachineModel;

public class FruitMachine {
    public static void main(String[] args) {
        PanelPrincipalView panelPrincipal = new PanelPrincipalView(new FruitMachineModel());
        panelPrincipal.setVisible(true);
        FruitMachineModel model = new FruitMachineModel();
        FruitMachineView view = new FruitMachineView(model);
        @SuppressWarnings("unused")
        FruitMachineController controller = new FruitMachineController(panelPrincipal, view, model);

    }
}