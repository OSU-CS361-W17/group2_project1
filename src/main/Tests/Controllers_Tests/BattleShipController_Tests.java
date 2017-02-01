import Controllers.BattleshipController;
import Models.BaseBattleshipModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zain on 1/31/17.
 */
public class BattleShipController_Tests {
    private static BattleshipController bsc = new BattleshipController();

    @Test
    public void ToJson_Conversion(){
        String ConvertedJSON = bsc.ToJson(new BaseBattleshipModel());
        String CorrectResult = "{\"name\":\"ship\",\"length\":0,\"start\":{\"Across\":0,\"Down\":0},\"end\":{\"Across\":0,\"Down\":0}}";
        assertEquals(CorrectResult, ConvertedJSON);
    }

    @Test
    public void ToModel_Conversion(){
        String JSON = "{\"name\":\"ship\",\"length\":0,\"start\":{\"Across\":0,\"Down\":0},\"end\":{\"Across\":0,\"Down\":0}}";
        BaseBattleshipModel Model = bsc.ToModel(JSON);
        
        assertEquals("ship", Model.name);
        assertEquals(0,Model.length);
        assertEquals(0,Model.start.Across);
        assertEquals(0,Model.start.Down);
        assertEquals(0,Model.end.Across);
        assertEquals(0,Model.end.Down);
    }
}
