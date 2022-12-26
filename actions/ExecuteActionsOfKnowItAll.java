package actions;

import characters.KnowItAll;
import characters.Street;
import items.Horrizon;
import items.Rocket;
import items.Wind;

public interface ExecuteActionsOfKnowItAll {
    void exSee(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket);
    void exSleep(Horrizon horrizon, Wind wind, KnowItAll knowItAll, Rocket rocket);
    void exHands(KnowItAll knowItAll);
    void exAwake(KnowItAll knowItAll);
    void exRun(KnowItAll knowItAll, Street.Home home, Street.Gate gate, Street.Square square);
}
