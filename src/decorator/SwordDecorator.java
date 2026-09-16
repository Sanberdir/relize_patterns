package decorator;

public abstract class SwordDecorator extends IronSword {
    protected final IronSword wrapped;

    public SwordDecorator(IronSword wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public int getDamage() {
        return wrapped.getDamage();
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }
}