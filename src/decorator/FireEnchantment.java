package decorator;

public class FireEnchantment extends SwordDecorator {
    public FireEnchantment(IronSword wrapped) {
        super(wrapped);
    }

    @Override
    public int getDamage() {
        return wrapped.getDamage() + 2;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Зачарование Огня";
    }
}