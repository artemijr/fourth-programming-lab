package characters;

import items.*;

public class KnowItAll extends PersonsWithActions implements CreateSun, CreateMoon {


    public static boolean handlock;
    public static boolean awake;

    public KnowItAll() {
        this.setCondition(Condition.HAPPY);
    }


    public void see(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket) {
        System.out.println(horrizon.list.toString());
        if (horrizon.list.size() == 6) {
            rocket.shine();
            System.out.println("");
            knowItAll.setCondition(Condition.HAPPY);
            if (Math.random() * 100 < 10) {
                wind.blow();
                knowItAll.setCondition(Condition.CHEERFULNESSANDHAPPINESS);
            }
        } else {
            knowItAll.setCondition(Condition.SAD);
        }
    }

    public void sleep(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket) {
        horrizon.list.remove(horrizon.list.size() - 1);
        horrizon.list.add(knowItAll.createMoon());
        if (Math.random() * 100 <= 10) {
            horrizon.list.remove(2);
        }
        horrizon.list.remove(horrizon.list.size() - 1);
        horrizon.list.add(knowItAll.createSun());

    }



    @Override
    public SimpleObjects createMoon() {
        return new Moon();
    }

    @Override
    public SimpleObjects createSun() {
        return new Sun();
    }
}
