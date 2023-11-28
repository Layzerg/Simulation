import Jungle.InitActions;
import Jungle.Map;
import Jungle.TurnActions;

import javax.swing.*;

public class Simulation {
    public static void main(String[] args) {
        Map map = new Map();
        InitActions initActions = new InitActions(map);
        map = initActions.mapFilling();
        JFrame window = new Jungle.RenderMap(map);
        TurnActions turnActions = new TurnActions(map);
        turnActions.poiskA();

    }
}

