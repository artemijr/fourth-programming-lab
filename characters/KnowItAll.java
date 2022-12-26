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
    public void RunOuT(KnowItAll knowItAll, Street.Home home, Street.Gate gate, Street.Square square){
        home.list.add(0, knowItAll);
        home.changeLocation(home, gate, knowItAll);
        gate.changeLocation(gate, square, knowItAll);
    }
    public void lookAtPlatform(){
        {
            class platform{
                public void information(){
                    System.out.println("Nothing");
                }
            }
            platform platform= new platform();
            platform.information();
        }
        Fuksia fuksia = new Fuksia(){
            void shake(){
                System.out.println("KnowItAll shake Fuksia");
            }
            {
                this.shake();
            }
        };
        Sledochka sledochka= new Sledochka();
        sledochka.information();
    }
    @Override
    public SimpleObjects createMoon() {
        return new Moon();
    }

    @Override
    public SimpleObjects createSun() {
        return new Sun();
    }
    public  class Sledochka{
        void information(){
            System.out.println("See with nessesary");
        }
    }
}
