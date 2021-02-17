package com.example.ReportPlayer.repository.report.player;

import com.example.ReportPlayer.enumerated.Server;
import com.example.ReportPlayer.models.report.player.PlayerPhilippines;
import org.springframework.stereotype.Repository;

@Repository("player_repository_"+ Server.Region.PHILIPPINES)
public interface PlayerPhilippinesRepository extends PlayerBaseRepository<PlayerPhilippines> {
}
