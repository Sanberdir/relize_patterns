package strategy;

public class PotionAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Стив кидает зелье! -4 HP");
    }
}
