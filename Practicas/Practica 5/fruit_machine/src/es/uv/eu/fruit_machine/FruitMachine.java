package es.uv.eu.fruit_machine;

import es.uv.eu.fruit_machine.view.FruitMachineView;
import es.uv.eu.fruit_machine.view.PanelPrincipal;
import es.uv.eu.fruit_machine.controller.FruitMachineController;
import es.uv.eu.fruit_machine.model.FruitMachineModel;

public class FruitMachine {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        FruitMachineModel model = new FruitMachineModel();
        FruitMachineView view = new FruitMachineView(model);
        @SuppressWarnings("unused")
        FruitMachineController controller = new FruitMachineController(view, model);

    }
}