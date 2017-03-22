package nl.elridge.sudoku.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import main.Game_List;
import nl.elridge.sudoku.model.Game;
import nl.elridge.sudoku.view.Sudoku;
import nl.elridge.sudoku.view.SudokuPanel;

/**
 * This class controls all user actions from ButtonPanel.
 *
 * @author shubham
 */
public class ButtonController implements ActionListener {
    private Game game;

    /**
     * Constructor, sets game.
     *
     * @param game  Game to be set.
     */
    public ButtonController(Game game) {
        this.game = game;
    }

    /**
     * Performs action after user pressed button.
     *
     * @param e ActionEvent.
     */
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "New":
                game.newGame();
                break;
            case "Check":
                game.checkGame();
                break;
               case "Back":
         new Game_List().setVisible(true);
                                break;
            case "Help on":
                game.setHelp(((JCheckBox)e.getSource()).isSelected());
                break;
            default:
                game.setSelectedNumber(Integer.parseInt(e.getActionCommand()));
                break;
        }
    }

   }