package Controllers;
import Models.BaseBattleshipModel;
import Models.GameStatsModel;
import com.google.gson.Gson;
import spark.Request;


/**
 * Created by struthj on 1/27/17.
 * TODO: there's should be a way to only construct one Gson object.
 */
public class GameStatsController {
    public static String ToJson(GameStatsModel ModelData){
        Gson gson = new Gson();
        String data = gson.toJson(ModelData);

        return data;
    }


    public static GameStatsModel ToModel(Request req){
        Gson gson = new Gson();
        GameStatsModel gameModel = new GameStatsModel();
        BattleshipController bsc = new BattleshipController();
        BaseBattleshipModel ship = bsc.ToModel(req);
        gameModel.addShip(ship);
        return gameModel;
    }

}