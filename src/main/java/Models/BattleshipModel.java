package Models;

/**
 * Created by zain on 1/27/17.
 */
public class BattleshipModel {
    public String name;
    int length;

    locationPoint start;
    locationPoint end;


    public class locationPoint{
        int Across;
        int Down;

        public  locationPoint(){
            Across =0;
            Down =0;
        }
    }

    public BattleshipModel(){
        name = "ship";
        length = 0;
        start = new locationPoint();
        end = new locationPoint();
    }
}

