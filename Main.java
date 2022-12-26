import Other.City;
import Other.Criglya;
import Other.Police;
import Other.exOther;
import actions.ExMoves;
import actions.WrongWords;
import characters.KnowItAll;
import items.*;

public class Main implements CreateHorizon, CreateSimpleObjects, CreateMoon, CreateSun, ExecuteInterface, exOther {
    public static void main(String[] args) throws WrongWords {
        Main main= new Main();
        main.ExecuteActions(main.createHorizon(), (Rocket) main.createRocket());
        Window window= (Window) main.createWindow();


    }

    @Override
    public Horrizon createHorizon() {
        Main main= new Main();
        Horrizon horrizon= new Horrizon();
        horrizon.add(main.createHouse());
        horrizon.add(main.createHouse());
        horrizon.add(main.createRocket());
        horrizon.add(main.createHouse());
        horrizon.add(main.createHouse());
        horrizon.add(main.createSun());
        return horrizon;
    }

    @Override
    public SimpleObjects createHouse() {

        return new House();
    }

    @Override
    public SimpleObjects createRocket() {
        return new Rocket();
    }

    @Override
    public SimpleObjects createWindow() {
        return new Window();
    }

    @Override
    public SimpleObjects createSun() {
        return new Sun();
    }

    @Override
    public SimpleObjects createMoon() {
        return new Moon();
    }

    @Override
    public void ExecuteActions(Horrizon horrizon, Rocket rocket) throws WrongWords {
        ExMoves exMoves = new ExMoves();
        exMoves.ExMoves(horrizon, rocket);
    }

    @Override
    public void exOtherActions() {
        Police police= new Police();
        City city= new City();
        police.findcrime(city, new Criglya());
    }
}
