package Other;

import items.SimpleObjects;

import java.util.ArrayList;

public class City {
    ArrayList<Dwarfs> list= new ArrayList();
    ArrayList<SimpleObjects> listofitems= new ArrayList<>();

    public City() {
        this.listofitems.add(new bed());
        this.listofitems.add(new clothes());
    }
}
