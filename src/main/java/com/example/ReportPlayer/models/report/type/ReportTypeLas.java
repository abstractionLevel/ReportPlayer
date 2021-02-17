package com.example.ReportPlayer.models.report.type;

import com.example.ReportPlayer.models.report.player.Player;
import com.example.ReportPlayer.models.report.player.PlayerLas;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "report_type_las")
public class ReportTypeLas extends ReportType{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_las_id" ,nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PlayerLas player;

    public ReportTypeLas(String reportType) {
        super(reportType);
    }

    public ReportTypeLas() {

    }

    @Override
    public PlayerLas getPlayer() {
        return player;
    }

    @Override
    public void setPlayer(Player player) {
        this.player = (PlayerLas )player;
    }
}
