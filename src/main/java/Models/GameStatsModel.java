package Models;

import java.util.List;

/**
 * Created by zain on 1/27/17.
 */
public class GameStatsModel {
    //<editor-fold desc="Player Ships">
    public BaseBattleshipModel aircraftCarrier;
    public BaseBattleshipModel battleship;
    public BaseBattleshipModel cruiser;
    public BaseBattleshipModel destroyer;
    public BaseBattleshipModel submarine;
    //<end-editor>
    //<editor-fold desc="Computer Ships">
    public BaseBattleshipModel computer_aircraftCarrier;
    public BaseBattleshipModel computer_battleship;
    public BaseBattleshipModel computer_cruiser;
    public BaseBattleshipModel computer_destroyer;
    public BaseBattleshipModel computer_submarine;
    //<end-editor>
    List<LocationPoint> PlayerHits;
    List<LocationPoint> PlayerMisses;
    List<LocationPoint> ComputerHits;
    List<LocationPoint> ComputerMisses;

    public GameStatsModel(){
        //player ships
        aircraftCarrier = new BaseBattleshipModel("AircraftCarrier",5,
                0,0,  0,0);
        battleship = new BaseBattleshipModel("Battleship",4,
                0,0,  0,0);
        cruiser = new BaseBattleshipModel("Cruiser",3,
                0,0,  0,0);
        destroyer = new BaseBattleshipModel("Destroyer",2,
                0,0,  0,0);
        submarine = new BaseBattleshipModel("Submarine",2,
                0,0,  0,0);

        //computer ships
        computer_aircraftCarrier = new BaseBattleshipModel("Computer_AircraftCarrier",5,
                0,0,  0,0);
        computer_battleship = new BaseBattleshipModel("Computer_Battleship",4,
                0,0,  0,0);
        computer_cruiser = new BaseBattleshipModel("Computer_Cruiser",3,
                0,0,  0,0);
        computer_destroyer = new BaseBattleshipModel("Computer_Destroyer",2,
                0,0,  0,0);
        computer_submarine = new BaseBattleshipModel("Computer_Submarine",2,
                0,0,  0,0);
    }
    public boolean fireAt(LocationPoint point)
    {
        //check against computers ships
        if(point.Across >=computer_aircraftCarrier.startAcross && point.Across<=computer_aircraftCarrier.endAcross  &&
                point.Down>=computer_aircraftCarrier.startdown && point.Down<=computer_aircraftCarrier.endDown)
        {
            //hit
            //add coordinate to list
            PlayerHits.add(point);


        }
        if(point.Across >=battleship.startAcross && point.Across<=battleship.endAcross  &&
                point.Down>=battleship.startdown && point.Down<=battleship.endDown)
        {
        //hit
            // add coordinate to list
            PlayerHits.add(point);
        }
        if(point.Across >=cruiser.startAcross && point.Across<=cruiser.endAcross  &&
                point.Down>=cruiser.startdown && point.Down<=cruiser.endDown)
        {
            //hit
            //add coordinate to list
            PlayerHits.add(point);
        }
        if(point.Across >=destroyer.startAcross && point.Across<=destroyer.endAcross  &&
            point.Down>=destroyer.startdown && point.Down<=destroyer.endDown)
        {
        //hit
            // add coordinate to list
            PlayerHits.add(point);
        }
        if(point.Across >=submarine.startAcross && point.Across<=submarine.endAcross  &&
                point.Down>=submarine.startdown && point.Down<=submarine.endDown)
        {
            //hit
            //add coordinate to list
            PlayerHits.add(point);
        }
        else
        {
            //no hit
            PlayerMisses.add(point);
        }












    }
}
