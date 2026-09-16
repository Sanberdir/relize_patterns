package decorator;

public class IronSword implements Weapon {
    @Override
    public int getDamage() {
        return 6;
    }

    @Override
    public String getDescription() {
        return "Железный меч";
    }
}