package items;

import java.util.ArrayList;

public class Horrizon {
    public ArrayList<SimpleObjects> list;

    public Horrizon() {
        list = new ArrayList<>();
    }

    public void add(SimpleObjects simpleObjects){
        list.add(simpleObjects);
    }
}
