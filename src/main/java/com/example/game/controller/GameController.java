package com.example.game.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.game.model.Player;

@Controller
public class GameController {

    @MessageMapping("/move")
    @SendTo("/topic/players")
    public Player movePlayer(Player player) {
        System.out.println("Player moved: " + player);
        return player; // gửi lại cho tất cả người chơi
    }
}