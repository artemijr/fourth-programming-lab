package items;

import characters.Condition;
import characters.PersonsWithActions;

public class Wind extends PersonsWithActions {
    public Wind() {
        this.setCondition(Condition.WIND);
    }
    public void blow(){
    }
}
