package Controllers;
import Models.BaseBattleshipModel;
import Models.GameStatsModel;
import com.google.gson.Gson;
import spark.Request;

/**
 * Created by zain on 1/27/17.
 * TODO: there's should be a way to only construct one Gson object.
 */
public class BattleshipController {
    private static Gson gson = new Gson();
    public static String ToJson(BaseBattleshipModel ModelData){
        Gson gson = new Gson();
        String data = gson.toJson(ModelData);
        return data;
        return gson.toJson(ModelData);
    }
    public static BaseBattleshipModel ToModel(Request req){
        Gson gson = new Gson();
        BaseBattleshipModel ship = new BaseBattleshipModel();
        int row = Integer.valueOf(req.params("row"));
        int col = Integer.valueOf(req.params("col"));
        ship.setOrientation(req.params("orientation"), row, col);
        return ship;
    }
    public static GameStatsModel UserFire (Request req){
        GameStatsModel model = new GameStatsModel();
        BaseBattleshipModel b = new BaseBattleshipModel();
        int x = Integer.valueOf(req.params("row"));
        int y = Integer.valueOf(req.params("col"));
        LocationPoint p= b.setFireLocation(x,y);
        model.fireAt(p);
    }
   }


