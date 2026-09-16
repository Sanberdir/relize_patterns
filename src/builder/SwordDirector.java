package builder;

import java.util.List;

public class SwordDirector {

    public Sword buildEnchantedDiamondSword(SwordBuilder builder) {
        builder.buildName("Алмазный меч");
        builder.buildDamage(8);
        builder.buildDurability(1561);
        builder.buildEnchantments(List.of("Острота V", "Прочность III"));
        return builder.getResult();
    }

    public Sword buildSimpleNetheriteSword(SwordBuilder builder) {
        builder.buildName("Незеритовый меч");
        builder.buildDamage(10);
        builder.buildDurability(2031);
        builder.buildEnchantments(List.of());
        return builder.getResult();
    }
}