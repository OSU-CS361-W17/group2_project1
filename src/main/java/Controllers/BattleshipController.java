package Controllers;
import Models.BaseBattleshipModel;
import com.google.gson.Gson;
import spark.Request;


/**
 * Created by zain on 1/27/17.
 * TODO: there's should be a way to only construct one Gson object.
 */
public class BattleshipController {
    public static String ToJson(BaseBattleshipModel ModelData){
        Gson gson = new Gson();
        String data = gson.toJson(ModelData);

        return data;
    }

    public static BaseBattleshipModel ToModel(Request req){
        Gson gson = new Gson();
        BaseBattleshipModel ship = new BaseBattleshipModel();
        ship.setName(req.params("id"));
        int row = Integer.valueOf(req.params("row"));
        int col = Integer.valueOf(req.params("col"));
        ship.setOrientation(req.params("orientation"), row, col);
        return ship;
    }

}
