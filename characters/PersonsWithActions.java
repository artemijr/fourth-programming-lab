package characters;

import org.jetbrains.annotations.NotNull;

public abstract class PersonsWithActions {
    private Condition condition;
    void changeCondtion(@NotNull PersonsWithActions personsWithActions, Condition condition){
        personsWithActions.setCondition(condition);
    }

    public void setCondition(@NotNull Condition condition) {
        this.condition = condition;
        if (condition.hashCode()!=Condition.WIND.hashCode()){
            System.out.println(this.condition);
        }
    }
}
