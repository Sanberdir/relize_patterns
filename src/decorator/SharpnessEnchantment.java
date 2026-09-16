package decorator;

public class SharpnessEnchantment extends WeaponDecorator {
    public SharpnessEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int getDamage() {
        return weapon.getDamage() + 3;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + " + Острота";
    }
}
