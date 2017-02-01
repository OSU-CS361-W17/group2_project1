import Models.BaseBattleshipModel;
import Models.LocationPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zain on 1/29/17.
 */
public class BaseBattleshipModel_Tests {
    LocationPoint StartOfShip = new LocationPoint(1,3);
    LocationPoint EndOfShip = new LocationPoint(3,3);
    BaseBattleshipModel Ship;

    @Test
    public void defaultConstructor_Name(){
        Ship = new BaseBattleshipModel();
        assertEquals("ship",Ship.name);
    }

    @Test
    public void defaultConstructor_length(){
        Ship = new BaseBattleshipModel();
        assertEquals(0,Ship.length);
    }

    @Test
    public void defaultConstructor_Points(){
        Ship = new BaseBattleshipModel();

        assertEquals(0, Ship.end.Across);
        assertEquals(0, Ship.end.Down);

        assertEquals(0, Ship.start.Across);
        assertEquals(0, Ship.start.Down);
    }

    @Test
    public void nonDefault_name(){
        Ship = new BaseBattleshipModel("Test",3,1,1,1,2);

        assertEquals("Test",Ship.name);
    }

    @Test
    public void nonDefault_Length(){
        Ship = new BaseBattleshipModel("Test",3,1,1,1,2);

        assertEquals(3,Ship.length);
    }

    @Test
    public void nonDefault_Start(){
        Ship = new BaseBattleshipModel("Test",3,1,1,1,2);

        assertEquals(1,Ship.start.Across);
        assertEquals(1,Ship.start.Down);
    }

    @Test
    public void nonDefault_End(){
        Ship = new BaseBattleshipModel("Test",3,1,1,1,2);

        assertEquals(1,Ship.end.Across);
        assertEquals(2,Ship.end.Down);
    }
}
