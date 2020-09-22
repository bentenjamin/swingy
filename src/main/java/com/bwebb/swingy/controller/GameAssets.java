package com.bwebb.swingy.controller;

import com.bwebb.swingy.controller.gameStates.GSContainer;
import com.bwebb.swingy.controller.gameStates.GameState;
import com.bwebb.swingy.model.chars.player.Character;
import com.bwebb.swingy.model.chars.player.SaveHandler;
import com.bwebb.swingy.model.map.MapHandler;
import com.bwebb.swingy.view.ViewInterface;
import com.bwebb.swingy.view.terminal.TerminalView;
import com.github.javafaker.Faker;

import java.util.Random;

public class GameAssets {
    public GSContainer states = new GSContainer(this);
    public ViewInterface display = null;
    public GameState state = null;
    public Character player = null;
    public MapHandler mapHandler = new MapHandler();
    public TerminalView terminalView = new TerminalView();
    public Faker faker = new Faker();
    public Random random = new Random();
    public SaveHandler saveHandler = new SaveHandler();
}
