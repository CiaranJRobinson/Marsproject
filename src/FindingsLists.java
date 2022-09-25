import java.util.ArrayList;

public class FindingsLists {
    public FindingsLists() throws InterruptedException{
        thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found,");
        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second, that last one is not a rock! We need to delete that one from the list.");
        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect.");

    }
}
