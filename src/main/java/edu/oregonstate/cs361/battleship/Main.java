package edu.oregonstate.cs361.battleship;

import Controllers.BattleshipController;
import Controllers.GameStatsController;
import Models.BaseBattleshipModel;
import Models.GameStatsModel;
import spark.Request;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        //This will allow us to server the static pages such as index.html, app.js, etc.
        staticFiles.location("/public");

        //This will listen to GET requests to /model and return a clean new model
        get("/model", (req, res) -> newModel());
        //This will listen to POST requests and expects to receive a game model, as well as location to fire to
        post("/fire/:row/:col", (req, res) -> fireAt(req));
        //This will listen to POST requests and expects to receive a game model, as well as location to place the ship
        post("/placeShip/:id/:row/:col/:orientation", (req, res) -> placeShip(req));
    }

    //This function should return a new model
    private static String newModel() {
        BattleshipController bsc = new BattleshipController();
        BaseBattleshipModel DefaultModel = new BaseBattleshipModel();

        return bsc.ToJson(DefaultModel);
    }

    //This function should accept an HTTP request and deseralize it into an actual Java object.
    private static BaseBattleshipModel getModelFromReq(Request req){
        BattleshipController bsc = new BattleshipController();
        return bsc.ToModel(req);
    }

    //This controller should take a json object from the front end, and place the ship as requested, and then return the object.
    private static String placeShip(Request req)
    {
        BattleshipController bsc = new BattleshipController();
        GameStatsModel model = new GameStatsModel();
        GameStatsController gsc = new GameStatsController();
        BaseBattleshipModel ship = getModelFromReq(req);
        model.addShip(ship);

        return gsc.ToJson(model);
    }

    //Similar to placeShip, but with firing.
    private static String fireAt(Request req) {
        return null;
    }

}