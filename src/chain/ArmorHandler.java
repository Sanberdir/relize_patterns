package chain;

public class ArmorHandler extends DamageHandler {
    private final int armorPoints;

    public ArmorHandler(int armorPoints) {
        this.armorPoints = armorPoints;
    }

    @Override
    public boolean handle(int damage) {
        int absorbed = Math.min(armorPoints, damage);
        int reduced = damage - absorbed;

        System.out.println("Броня поглотила " + absorbed +
                " урона. Осталось: " + reduced);

        // Броня не "закрывает" запрос — передаём дальше
        if (reduced == 0) {
            System.out.println("Броня полностью погасила урон. Цепочка остановлена.");
            return true; // обработано — стоп
        }
        return passToNext(reduced);
    }
}