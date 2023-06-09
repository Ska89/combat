package org.doren.ranks;

public enum ArmyRanks {
    //    PRIVATE
    PRIVATE_E1("Private(E-1)"),
    PRIVATE_E2("Private(E-2)"),
    PRIVATE ("Private, First Class"),

    //    SERGEANT
    CORPORAL("Corporal"),
    SERGEANT("Sergeant"),
    STAFF_SERGEANT("Staff sergeant"),
    PLATOON_SERGEANT("Platoon sergeant"),
    FIRST_SERGEANT("First sergeant"),
    STAFF_SERGEANT_MAJOR("Staff sergeant major"),
    SERGEANT_MAJOR_OF_THE_ARMY("Sergeant major of the army"),
    //    WARRANT OFFICER
    WARRANT_OFFICER_1("Warrant officer 1"),
    WARRANT_OFFICER_2("Warrant officer 2"),
    WARRANT_OFFICCER_3("Warrant officer 3"),
    WARRANT_OFFICER_4("Warrant officer 4"),
    //    OFFICER
    SECOND_LIEUTENANT("Second lieutenant"),
    FIRST_LIEUTENANT("First lieutenant"),
    CAPTAIN("Captain"),
    MAJOR("Major"),
    LIEUTENANT_COLONEL("Lieutenant colonel"),
    COLONEL("Colonel"),
    //    GENERALS
    BRIGADIER_GENERAL("Brigadier general"),
    MAJOR_GENERAL("Major general"),
    LIEUTENANT_GENERAL("Lieutenant general"),
    GENERAL("General"),
    GENERAL_OF_THE_ARMY("General of the army");
    private final String rank;
    ArmyRanks(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
}
