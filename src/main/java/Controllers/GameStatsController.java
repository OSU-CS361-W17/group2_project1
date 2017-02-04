package Controllers;
import Models.BaseBattleshipModel;
import Models.GameStatsModel;
import Models.LocationPoint;
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

    public GameStatsModel ComputerFire(Request req) {
        GameStatsModel gameModel = ToModel(req);
        LocationPoint target = gameModel.computerSelectTarget();
        boolean isAHit = false;

        if((target.Across >= gameModel.aircraftCarrier.start.Across) &&
                (target.Across <= gameModel.aircraftCarrier.end.Across) &&
                (target.Down >= gameModel.aircraftCarrier.start.Down) &&
                (target.Down <= gameModel.aircraftCarrier.end.Down)) {
            isAHit = true;
        }

        else if((target.Across >= gameModel.battleship.start.Across) &&
                (target.Across <= gameModel.battleship.end.Across) &&
                (target.Down >= gameModel.battleship.start.Down) &&
                (target.Down <= gameModel.battleship.end.Down)) {
            isAHit = true;
        }

        else if((target.Across >= gameModel.cruiser.start.Across) &&
                (target.Across <= gameModel.cruiser.end.Across) &&
                (target.Down >= gameModel.cruiser.start.Down) &&
                (target.Down <= gameModel.cruiser.end.Down)) {
            isAHit = true;
        }

        else if((target.Across >= gameModel.destroyer.start.Across) &&
                (target.Across <= gameModel.destroyer.end.Across) &&
                (target.Down >= gameModel.destroyer.start.Down) &&
                (target.Down <= gameModel.destroyer.end.Down)) {
            isAHit = true;
        }

        else if((target.Across >= gameModel.submarine.start.Across) &&
                (target.Across <= gameModel.submarine.end.Across) &&
                (target.Down >= gameModel.submarine.start.Down) &&
                (target.Down <= gameModel.submarine.end.Down)) {
            isAHit = true;
        }

        if(isAHit) {
            gameModel.ComputerHits.add(target);
        }

        else {
            gameModel.ComputerMisses.add(target);
        }

        return gameModel;
    }
}