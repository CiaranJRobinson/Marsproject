public class Mars {
    public static void main(String[] args) {
        String colonyName = "Martians";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean Landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);

        System.out.println(shipFood);

        shipFood = shipFood + (shipFood * .5);
        System.out.println(shipFood);
        shipPopulation += 5;

        String landingLocation = "The Hill";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("Error, flight plan already set, landing on the Plain");
        }

        boolean landing = LandingCheck(100);
        new GuessingGame();
    }
    public static boolean LandingCheck(int loops) {
            for (int i=0; i != loops; i++){
                if ((i%3) == 0 && (i%5) == 0){
                    System.out.println("Keep Center");
                }else if((i%5) == 0){
                    System.out.println("Right");
                }else if((i%3) == 0){
                    System.out.println("left");
                }else{
                    System.out.println("Calculating");
                }
                try{
                Thread.sleep(250);}
                catch(Exception e){
            };}
            System.out.println("Landed");
            return false;
        }

    }


