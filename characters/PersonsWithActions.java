package characters;


public abstract class PersonsWithActions {
    private Condition condition;
    void changeCondtion(PersonsWithActions personsWithActions, Condition condition){
        personsWithActions.setCondition(condition);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
        if (condition.hashCode()!=Condition.WIND.hashCode()){
            System.out.println(this.condition);
        }
    }
}
