package com.example.jonmid.practicaborder.Parser;

import com.example.jonmid.practicaborder.Models.Game;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonGame {
    public static List<Game> getData(String content) throws JSONException {


        JSONObject jsonData = new JSONObject(content);
        JSONArray jsonArray = jsonData.getJSONArray(name:"amiibo");
        List<Game> GameList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject item = jsonArray.getJSONObject(i);


            Game game = new Game();
            game.setName(item.getString("name"));
            game.setName(item.getString("character"));
            game.setName(item.getString("gameSeries"));




            GameList.add(game);

        }

        return GameList;

    }
}
