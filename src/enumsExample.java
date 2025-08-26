public class enumsExample {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " +  this);
        }
        //This constructor is not public or protected, only private or default
        //Why? we don't want to create new objects
        //this is not the enum concept, that's why
        }
    // These are enums constants
    //These are public, static  add final
    //  Since its finals you can create enums
    //type is week
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        //for (Week day : week.values()) {
        //  System.out.println(day);
        //  }
        System.out.println(week.ordinal());
        System.out.println(week.valueOf("Monday"));
    }
}