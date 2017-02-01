package Models;
/**
 * Created by zain on 1/27/17.
 */
public class BaseBattleshipModel {
    public String name;
    public int length;

    public LocationPoint start;
    public LocationPoint end;

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
}

