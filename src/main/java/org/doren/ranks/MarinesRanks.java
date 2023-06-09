package org.doren.ranks;

public enum MarinesRanks {
//    Private
    PRIVATE("Private"),
    PRIVATE_FIRST_CLASS("Private first class"),
    LANCE_CORPORAL("Lance corporal"),
//    Sergeant
    CORPORAL("Corporal"),
    SERGEANT("Sergeant"),
    STAFF_SERGEANT("Staff sergeant"),
    GUNNERY_SERGEANT("Gunnery sergeant"),
    FIRST_SERGEANT("First sergeant"),
    SERGEANT_MAJOR("Sergeant major"),
    SERGEANT_MAJOR_OF_THE_MARINE_CORPS("Sergeant Major of the Marine Corps"),
//    WARRANT OFFICER
    WARRANT_OFFICER_1("Warrant officer-1"),
    CHIEF_WARRANT_OFFICER_2("Chief warrant officer-2"),
    CHIEF_WARRANT_OFFICER_3("Chief warrant officer-3"),
    CHIEF_WARRANT_OFFICER_4("Chief warrant officer-4"),
//    OFFICER
    SECOND_LIEUTENANT("Second lieutenant"),
    FIRST_LIEUTENANT("First lieutenant"),
    CAPTAIN("Captain"),
    MAJOR("Major"),
    LIEUTENANT_COLONEL("Lieutenant colonel"),
    COLONEL("Colonel"),
    //Generals
    BRIGADIER_GENERAL("Brigadier general"),
    MAJOR_GENERAL("Major general"),
    LIEUTENANT_GENERAL("Lieutenant general"),
    GENERAL("General");
    private final String rank;
    MarinesRanks(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
}
