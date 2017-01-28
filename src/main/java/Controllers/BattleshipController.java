package Controllers;
import Models.BaseBattleshipModel;
import com.google.gson.Gson;

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

    public static BaseBattleshipModel ToModel(String JsonData){
        Gson gson = new Gson();

        return gson.fromJson(JsonData, BaseBattleshipModel.class);
    }

}
