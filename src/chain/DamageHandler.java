package chain;

public abstract class DamageHandler {
    protected DamageHandler next;

    public DamageHandler setNext(DamageHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(int damage);


    protected boolean passToNext(int damage) {
        if (next != null) {
            return next.handle(damage);
        }
        System.out.println("Цепочка закончилась, урон не обработан: " + damage);
        return false;
    }
}