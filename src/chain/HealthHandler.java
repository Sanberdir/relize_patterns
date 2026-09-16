package chain;

public class HealthHandler extends DamageHandler {
    private int health;

    public HealthHandler(int health) {
        this.health = health;
    }

    @Override
    public boolean handle(int damage) {
        health -= damage;
        if (health < 0) health = 0;

        System.out.println("Здоровье Стива: " + health);

        if (health == 0) {
            System.out.println("Стив погиб! Цепочка остановлена.");
        }
        // Это конечный обработчик — всегда считаем, что запрос обработан
        return true;
    }
}