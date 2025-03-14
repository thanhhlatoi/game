package com.example.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.game.model.Player;

public interface PlayerRepository extends JpaRepository<Player, String> {
}