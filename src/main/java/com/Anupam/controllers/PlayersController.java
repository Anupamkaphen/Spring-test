package com.Anupam.controllers;

import com.Anupam.models.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController//("/v1")
public class PlayersController {
    private Map<String, List<Integer>> map = new HashMap<>();

    @GetMapping("/players")
    ResponseEntity<Map<String, List<Integer>>> getPlayers() {
        map.put("panakj", Arrays.asList(10, 20, 30, 40, 0));
        try {
            return new ResponseEntity(map, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/player")
    ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        try {
            map.put(player.getName(), player.getRun());
            return new ResponseEntity(player, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/player/{name)")
    ResponseEntity<Player> getPlayerName(@PathVariable String name) {
        try {
            return new ResponseEntity(map.get(name), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/player")
    ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        try {
            if (map.containsKey(player.getName())) {
                return new ResponseEntity(map.put(player.getName(), player.getRun()), HttpStatus.OK);
            }
            return new ResponseEntity("player does not exist", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

//    @GetMapping("/playersavg")
//    ResponseEntity<Map<String, List<Integer>>> getPlayersavg() {
//        int sum = 0;
//        for ((Map.Entry < Integer, Player > p :map.entrySet()){
//            sum = sum + p.getValue().getplayer();
//        }
//        return sum / map.value();
//        try {
//            return new ResponseEntity(map, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//@GetMapping("/players")
//    ResponseEntity<Map<String, List<Integer>>>  () {
//        int maxScore = Collections.max(scores);
///
//        for (int i = 0; i < scores.size(); i++) {
//            if (scores.get(i) == maxScore) {
//                System.out.println("Player " + (i+1) + " won with a final score of " + maxScore);
//                break;
//            }
//        }
