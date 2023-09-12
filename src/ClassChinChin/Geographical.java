package ClassChinChin;

public enum Geographical {
    NORTH_CENTRAL(new String[]{"Benue" ,"FCT", "Kogi", "Nassarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba","Yoba"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kano", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_SOUTH(new String[]{"Akwa_ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun","Oyo"}),
    SOUTH_EAST(new String[]{"Enugu", ""});

    private String[] states;


    Geographical(String[] states) {this.states = states;}

    public String[] states(){return this.states;}

    public static Geographical geopolitical(String states) {
        for (Geographical zone : Geographical.values()) {
            for (String state : zone.states()) {
                boolean isState = state.equalsIgnoreCase(states);
                if (isState) {
                    return zone;}
            }
        }
        return null;
    }

}
