package org.doren.sections.team;

import org.doren.sections.SectionTeam;
import org.doren.units.Leader;
import org.doren.units.Unit;

public class SniperTeam extends SectionTeam implements Team {
    private Leader shooter;
    private Unit backupShooter;
    private Unit flanker;
    private Unit spotter;

    public Leader getLeader() {
        return shooter;
    }
}
