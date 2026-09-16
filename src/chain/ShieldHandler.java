package chain;

public class ShieldHandler extends DamageHandler {
    private final int blockAmount;

    public ShieldHandler() {
        this(3);
    }

    public ShieldHandler(int blockAmount) {
        this.blockAmount = blockAmount;
    }

    @Override
    public boolean handle(int damage) {
        if (damage <= 0) {
            System.out.println("Щит: урона нет, передаю дальше.");
            return passToNext(damage);
        }

        int blocked = Math.min(blockAmount, damage);
        int reduced = damage - blocked;

        System.out.println("Щит блокировал " + blocked +
                " урона. Осталось: " + reduced);

        return passToNext(reduced);
    }
}