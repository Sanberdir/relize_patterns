package decorator;

public class FireEnchantment extends WeaponDecorator {
    public FireEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int getDamage() {
        return weapon.getDamage() + 2;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + " + Зачарование Огня";
    }
}