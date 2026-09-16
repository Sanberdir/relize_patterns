package proxy;

public class RealChest implements Chest {
    @Override
    public void open(String player) {
        System.out.println("Сундук открыт для " + player + ". Внутри: алмазы!");
    }
}