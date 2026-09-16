package strategy;

public class SwordAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Стив бьёт мечом! -8 HP");
    }
}
