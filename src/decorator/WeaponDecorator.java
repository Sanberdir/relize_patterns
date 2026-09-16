package decorator;

public abstract class WeaponDecorator implements Weapon {
    protected final Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }
}