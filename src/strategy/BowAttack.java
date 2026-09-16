package strategy;

public class BowAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Стив стреляет из лука! -5 HP");
    }
}