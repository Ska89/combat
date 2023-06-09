package org.example.sections.team;

import lombok.Data;
import org.example.sections.SectionTeam;
import org.example.units.Leader;
import org.example.units.Unit;

@Data
public class FireTeam extends SectionTeam implements Team{
    private Unit teamLeaderTL;
    private Unit riflemanR;
    private Unit grenadierRiflemanGR;
    private Unit automaticRiflemanAR;

    public Unit getLeader() {
        return teamLeaderTL;
    }
}
