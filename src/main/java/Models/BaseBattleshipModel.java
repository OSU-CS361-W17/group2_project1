package Models;
/**
 * Created by zain on 1/27/17.
 */
public class BaseBattleshipModel {
    String name;
    int length;
    LocationPoint start;
    LocationPoint end;

    public BaseBattleshipModel(){
        name = "ship";
        length = 0;
        start = new LocationPoint();
        end = new LocationPoint();
    }

    public  BaseBattleshipModel(String Name,int Length,
                                int StartAcross,int StartDown,
                                int EndAcross,int EndDown){
        name = Name;
        length = Length;

        start = new LocationPoint(StartAcross,StartDown);
        end = new LocationPoint(EndAcross,EndDown);
    }

    public void setName(String id)
    {
        if(id.equals("aircraftCarrier"))
        {
            name = "AircraftCarrier";
            length = 5;
        }
        else if(id.equals("battleship"))
        {
            name = "Battleship";
            length = 4;
        }
        else if(id.equals("cruiser"))
        {
            name = "Cruiser";
            length = 3;
        }
        else if(id.equals("destroyer"))
        {
            name = "Destroyer";
            length = 2;
        }
        else if(id.equals("submarine"))
        {
            name = "Submarine";
            length = 2;
        }
        else
        {
            name = null;
        }
    }

    public void setOrientation(String orientation, int row, int col)
    {
        if(orientation.equals("horizontal"))
        {
            start.set(row, col);
            end.set(row + length, col);
        }
        else  //orientation is vertical
        {
            start.set(row, col);
            end.set(row, col + length);
        }
    }
}
