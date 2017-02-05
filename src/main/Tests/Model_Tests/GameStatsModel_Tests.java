import Models.GameStatsModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zain on 1/29/17.
 */
public class GameStatsModel_Tests {
    GameStatsModel game;

    @Test
    public void DefaultConstructor_Player_AircraftCarrier(){
        game = new GameStatsModel();

        assertEquals(game.aircraftCarrier.name,"AircraftCarrier");
        assertEquals(game.aircraftCarrier.length,5);
        assertEquals(game.aircraftCarrier.start.Across,0);
        assertEquals(game.aircraftCarrier.start.Down,0);
        assertEquals(game.aircraftCarrier.end.Across,0);
        assertEquals(game.aircraftCarrier.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Player_Battleship(){
        game = new GameStatsModel();

        assertEquals(game.battleship.name,"Battleship");
        assertEquals(game.battleship.length,4);
        assertEquals(game.battleship.start.Across,0);
        assertEquals(game.battleship.start.Down,0);
        assertEquals(game.battleship.end.Across,0);
        assertEquals(game.battleship.end.Down,0);
    }
    @Test
    public void DefaultConstructor_Player_Cruiser(){
        game = new GameStatsModel();

        assertEquals(game.cruiser.name,"Cruiser");
        assertEquals(game.cruiser.length,3);
        assertEquals(game.cruiser.start.Across,0);
        assertEquals(game.cruiser.start.Down,0);
        assertEquals(game.cruiser.end.Across,0);
        assertEquals(game.cruiser.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Player_Destroyer(){
        game = new GameStatsModel();

        assertEquals(game.destroyer.name,"Destroyer");
        assertEquals(game.destroyer.length,2);
        assertEquals(game.destroyer.start.Across,0);
        assertEquals(game.destroyer.start.Down,0);
        assertEquals(game.destroyer.end.Across,0);
        assertEquals(game.destroyer.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Player_Submarine(){
        game = new GameStatsModel();

        assertEquals(game.submarine.name,"Submarine");
        assertEquals(game.submarine.length,2);
        assertEquals(game.submarine.start.Across,0);
        assertEquals(game.submarine.start.Down,0);
        assertEquals(game.submarine.end.Across,0);
        assertEquals(game.submarine.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Computer_AircraftCarrier(){
        game = new GameStatsModel();

        assertEquals(game.computer_aircraftCarrier.name,"Computer_AircraftCarrier");
        assertEquals(game.computer_aircraftCarrier.length,5);
        assertEquals(game.computer_aircraftCarrier.start.Across,0);
        assertEquals(game.computer_aircraftCarrier.start.Down,0);
        assertEquals(game.computer_aircraftCarrier.end.Across,0);
        assertEquals(game.computer_aircraftCarrier.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Computer_Battleship(){
        game = new GameStatsModel();

        assertEquals(game.computer_battleship.name,"Computer_Battleship");
        assertEquals(game.computer_battleship.length,4);
        assertEquals(game.computer_battleship.start.Across,0);
        assertEquals(game.computer_battleship.start.Down,0);
        assertEquals(game.computer_battleship.end.Across,0);
        assertEquals(game.computer_battleship.end.Down,0);
    }
    @Test
    public void DefaultConstructor_Computer_Cruiser(){
        game = new GameStatsModel();

        assertEquals(game.computer_cruiser.name,"Computer_Cruiser");
        assertEquals(game.computer_cruiser.length,3);
        assertEquals(game.computer_cruiser.start.Across,0);
        assertEquals(game.computer_cruiser.start.Down,0);
        assertEquals(game.computer_cruiser.end.Across,0);
        assertEquals(game.computer_cruiser.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Computer_Destroyer(){
        game = new GameStatsModel();

        assertEquals(game.computer_destroyer.name,"Computer_Destroyer");
        assertEquals(game.computer_destroyer.length,2);
        assertEquals(game.computer_destroyer.start.Across,0);
        assertEquals(game.computer_destroyer.start.Down,0);
        assertEquals(game.computer_destroyer.end.Across,0);
        assertEquals(game.computer_destroyer.end.Down,0);
    }

    @Test
    public void DefaultConstructor_Computer_Submarine(){
        game = new GameStatsModel();

        assertEquals(game.computer_submarine.name,"Computer_Submarine");
        assertEquals(game.computer_submarine.length,2);
        assertEquals(game.computer_submarine.start.Across,0);
        assertEquals(game.computer_submarine.start.Down,0);
        assertEquals(game.computer_submarine.end.Across,0);
        assertEquals(game.computer_submarine.end.Down,0);
    }
    @Test
    public void DefaultConstructor{
            game = new GameStatsModel();
    assertEquals(game.computer_submarine.name,"Computer_Submarine");

}
    }