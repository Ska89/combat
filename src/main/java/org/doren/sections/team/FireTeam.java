package org.doren.sections.team;

import lombok.Data;
import org.doren.sections.SectionTeam;
import org.doren.units.Unit;

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
