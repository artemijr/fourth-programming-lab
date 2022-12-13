package actions;

import characters.*;
import com.sun.tools.javac.Main;
import items.*;

import java.util.Scanner;

public class ExMoves implements CreateWind, CreateKnowItAll, ExecuteActionsOfKnowItAll {
    public void ExMoves(Horrizon horrizon, Rocket rocket) {
        Scanner in = new Scanner(System.in);
        ExMoves exMoves = new ExMoves();
        KnowItAll knowItAll = (KnowItAll) exMoves.createKnowItAll();
        while (true) {
            String str = in.nextLine();
            switch (str) {
                case ("sleep"): {
                    exMoves.exSleep(horrizon, (Wind) createWind(), knowItAll, rocket);
                    break;
                }
                case ("see"): {
                    exMoves.exSee(horrizon, (Wind) createWind(), knowItAll, rocket);
                    break;
                }
                case ("hands"): {
                    Output.hands();
                    break;
                }
                case ("awake"): {
                    Output.awake();
                    break;
                }
                case ("break"): {
                    System.exit(0);

                }
                default:{
                    Output.wrong();
                }

            }
        }

    }



    @Override
    public PersonsWithActions createKnowItAll() {
        return new KnowItAll();
    }

    @Override
    public PersonsWithActions createWind() {
        return new Wind();
    }

    @Override
    public void exSee(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket) {
        knowItAll.see(horrizon, wind, knowItAll, rocket);
    }

    @Override
    public void exSleep(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket) {
        knowItAll.sleep(horrizon, wind, knowItAll, rocket);
    }

    @Override
    public void exHands(KnowItAll knowItAll) {
        Output.hands();
    }

    @Override
    public void exAwake(KnowItAll knowItAll) {
        Output.awake();
    }
}
