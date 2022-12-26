package actions;

import characters.*;
import com.sun.tools.javac.Main;
import items.*;

import java.util.Scanner;

public class ExMoves implements CreateWind, CreateKnowItAll, ExecuteActionsOfKnowItAll,createStreet{
    public void ExMoves(Horrizon horrizon, Rocket rocket) throws WrongWords {
        Scanner in = new Scanner(System.in);
        ExMoves exMoves = new ExMoves();
        KnowItAll knowItAll = (KnowItAll) exMoves.createKnowItAll();
        while (true) {
            try {
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
                    case ("run out"):{
                        if (horrizon.list.size()<6) {
                            exMoves.exRun(knowItAll, exMoves.createHome(), exMoves.createGate(), exMoves.createSquare());
                            break;
                        }
                        else {
                            System.out.println("Everything is normal");
                            break;
                        }
                    }
                    case ("break"): {
                        System.exit(0);
                    }
                    default:{
                        throw new WrongWords();
                    }

                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
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

    @Override
    public void exRun(KnowItAll knowItAll, Street.Home home, Street.Gate gate, Street.Square square) {
        knowItAll.RunOuT(knowItAll, home, gate, square);
    }

    @Override
    public Street.Home createHome() {
        return new Street.Home();
    }

    @Override
    public Street.Gate createGate() {
        return new Street.Gate();
    }

    @Override
    public Street.Square createSquare() {
        return new Street.Square();
    }
}
