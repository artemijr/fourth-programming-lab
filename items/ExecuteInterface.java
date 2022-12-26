package items;

import actions.WrongWords;
import items.Horrizon;

public interface ExecuteInterface {
    void ExecuteActions(Horrizon horrizon, Rocket rocket) throws WrongWords;
}
