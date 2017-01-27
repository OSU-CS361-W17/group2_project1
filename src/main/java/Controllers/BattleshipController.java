package Controllers;
import Models.BattleshipModel;
import com.google.gson.Gson;

/**
 * Created by zain on 1/27/17.
 * TODO: there's should be a way to only construct one Gson object.
 */
public class BattleshipController {
    public static String ToJson(BattleshipModel ModelData){
        Gson gson = new Gson();
        String data = gson.toJson(ModelData);

        return data;
    }

    public static BattleshipModel ToModel(String JsonData){
        Gson gson = new Gson();

        return gson.fromJson(JsonData,BattleshipModel.class);
    }

}
