package es.uv.eu;

import es.uv.eu.view.FruitMachineView;
import es.uv.eu.view.PanelPrincipal;
import es.uv.eu.controller.FruitMachineController;
import es.uv.eu.model.FruitMachineModel;

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