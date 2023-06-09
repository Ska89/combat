package org.example.sections.team;

import org.example.sections.SectionTeam;
import org.example.units.Leader;
import org.example.units.Shooter;
import org.example.units.Unit;

public class SniperTeam extends SectionTeam implements Team {
    private Leader shooter;
    private Unit backupShooter;
    private Unit flanker;
    private Unit spotter;

    public Leader getLeader() {
        return shooter;
    }
}
