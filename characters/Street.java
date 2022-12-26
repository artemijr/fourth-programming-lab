package characters;

import java.util.ArrayList;

public class Street {
    public ArrayList<PersonsWithActions> list = new ArrayList<>();

    public Street() {
    }

    public static class Home extends Street{

    }
    public static class Ladder extends Street{

    }
    public static class Gate extends Street{

    }
    public static class Square extends Street{}
    void changeLocation(Street street1, Street street2, KnowItAll knowItAll){
        street1.list.remove(0);
        street2.list.add(0, knowItAll);
    }
}
