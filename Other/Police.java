package Other;

import java.util.ArrayList;

public class Police {
    ArrayList<Dwarfs> crime= new ArrayList<>();
    public void findcrime(City city, Criglya criglya){
        criglya.changeLocation(city,new River());
        while(city.list.size()>0){
            crime.add(new Dwarfs());
            city.list.remove(0);
        }
    }
}
