package Models;

import java.util.List;
import java.lang.*;

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
    public List<LocationPoint> PlayerHits;
    public List<LocationPoint> PlayerMisses;
    public List<LocationPoint> ComputerHits;
    public List<LocationPoint> ComputerMisses;

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

        //lists
        List<LocationPoint> PlayerHits = new ArrayList<LocationPoint>();
        List<LocationPoint> PlayerMisses = new ArrayList<LocationPoint>();
        List<LocationPoint> ComputerHits = new ArrayList<LocationPoint>();
        List<LocationPoint> ComputerMisses = new ArrayList<LocationPoint>();
    }

    public void addShip(BaseBattleshipModel ship){
        if(ship.name.equals("AircraftCarrier")){
            aircraftCarrier = ship;
        }
        else if(ship.name.equals("Battleship")){
            battleship = ship;
        }
        else if(ship.name.equals("Cruiser")){
            cruiser = ship;
        }
        else if(ship.name.equals("Destroyer")){
            destroyer = ship;
        }
        else if(ship.name.equals("Submarine")){
            submarine = ship;
        }
    }
    public LocationPoint computerSelectTarget() {
        int across = (int) (Math.random() * 10 + 1);
        int down = (int) (Math.random() * 10 + 1);

        for (int i = 0; i < ComputerHits.size(); i++) {
            if((ComputerHits.get(i).Across == across) && (ComputerHits.get(i).Down == down)) {
                across = (int) (Math.random() * 10 + 1);
                down = (int) (Math.random() * 10 + 1);
                i = 0;
            }
        }

        for (int i = 0; i < ComputerMisses.size(); i++) {
            if((ComputerMisses.get(i).Across == across) && (ComputerMisses.get(i).Down == down)) {
                across = (int) (Math.random() * 10 + 1);
                down = (int) (Math.random() * 10 + 1);
                i = 0;
            }
        }
        LocationPoint shot = new LocationPoint(across, down);
        return shot;
    }
    public void fireAt(LocationPoint point)
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
