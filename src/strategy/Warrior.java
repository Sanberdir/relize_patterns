package strategy;

public class Warrior {
    private AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        if (strategy == null) {
            System.out.println("Нет оружия!");
            return;
        }
        strategy.attack();
    }
}
