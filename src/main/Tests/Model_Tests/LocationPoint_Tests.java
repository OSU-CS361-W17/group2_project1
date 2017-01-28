import Models.LocationPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zain on 1/27/17.
 */
class LocationPoint_Tests {
    LocationPoint point;

    @Test
    public void defaultConstructorAcross() {
        point = new LocationPoint();
        assertEquals(point.Across, 0);
    }

    @Test
    public void defaultConstructorDown(){
        point = new LocationPoint();
        assertEquals(point.Down,0);

    }

    @Test
    public void nonDefaultAcross(){
        point = new LocationPoint(1,1);
        assertEquals(point.Across,1);
    }

    @Test
    public void nonDefaultDown(){
        point = new LocationPoint(1,1);
        assertEquals(point.Down,1);
    }
}