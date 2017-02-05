import Controllers.GameStatsController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by struthj on 2/2/17.
 */
class GameStatsController_Tests {
    BaseBattleshipModel battleship;
    LocationPoint start1 = new LocationPoint(5, 5);
    LocationPoint end1 = new LocationPoint(5, 8);
    battleship = new BaseBattleshipModel("Battleship", 4, start1, end1);
    Request req = new Request;

    @Test
    public void testToModel() {
        GameStatsModel model = GameStatsController.ToModel(req);
        model.addShip(battleship);
        assertNotNull("should not be null", model);
        assertEquals("battleship name should be Battleship" model.battleship.name, "Battleship");
    }
    @Test
    public void testUserFire() {
        GameStatsModel model = GameStatsController.ToModel(req);
        model.addShip(battleship);

        for(int i = 0; i < 20; i++) {
             model = GameStatsController.UserFire();
            assertTrue("either PlayerHits or PlayerMisses shouldn't be empty", ((model.PlayerHits.size() != 0) ||
                    (model.PlayerMisses.size() != 0)));
            model.PlayerHits.clear();
            model.PlayerMisses.clear();
    }
    @Test
    public void testComputerFire() {
        GameStatsModel model = GameStatsController.ToModel(req);
        model.addShip(battleship);

        for(int i = 0; i < 20; i++) {
            model = GameStatsController.ComputerFire(model);
            assertTrue("either ComputerHits or ComputerMisses shouldn't be empty", ((model.ComputerHits.size() != 0) ||
                (model.ComputerMisses.size() != 0)));
            model.ComputerHits.clear();
            model.ComputerMisses.clear();
        }
    }
}