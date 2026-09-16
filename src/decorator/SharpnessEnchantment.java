package decorator;

public class SharpnessEnchantment extends SwordDecorator {
    public SharpnessEnchantment(IronSword wrapped) {
        super(wrapped);
    }

    @Override
    public int getDamage() {
        return wrapped.getDamage() + 3;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Острота";
    }
}
