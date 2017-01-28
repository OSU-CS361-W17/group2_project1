package Controllers;
import Models.BaseBattleshipModel;
import com.google.gson.Gson;

/**
 * Created by zain on 1/27/17.
 * TODO: there's should be a way to only construct one Gson object.
 */
public class BattleshipController {
    private static Gson gson = new Gson();
    public static String ToJson(BaseBattleshipModel ModelData){
        gson = new Gson();
        String data = gson.toJson(ModelData);

        return data;
    }

    public static BaseBattleshipModel ToModel(String JsonData){
        gson = new Gson();

        return gson.fromJson(JsonData, BaseBattleshipModel.class);
    }

}
