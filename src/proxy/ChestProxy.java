package proxy;

public class ChestProxy implements Chest {
    private final RealChest realChest = new RealChest();
    private final String owner;

    public ChestProxy(String owner) {
        this.owner = owner;
    }

    @Override
    public void open(String player) {
        if (owner.equals(player)) {
            realChest.open(player);
        } else {
            System.out.println("Доступ запрещён для " + player + "!");
        }
    }
}