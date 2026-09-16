package builder;

import java.util.List;

public interface SwordBuilder {
    void buildName(String name);
    void buildDamage(int damage);
    void buildDurability(int durability);
    void buildEnchantments(List<String> enchantments);

    Sword getResult();
}