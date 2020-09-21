package com.bwebb.swingy.controller.gameStates;

import com.bwebb.swingy.controller.GameState;
import com.bwebb.swingy.controller.GameStateParent;

import static com.bwebb.swingy.controller.GameController.*;

public class Win extends GameStateParent {
    @Override
    public void printMe() {
        display.win();
    }

    @Override
    public boolean evaluate(String userInput) {
        return true;
    }

    @Override
    public void execute(String userInput) {
        if (commands.containsKey(userInput))
            commands.get(userInput).run();
        else {
            player.saveCharacter();
            currentState = gameStates.menu;
        }
    }
}
