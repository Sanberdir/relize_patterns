package builder;

import java.util.List;

public class NetheriteSwordBuilder implements SwordBuilder {
    private final Sword sword = new Sword();

    @Override public void buildName(String name)               { sword.setName(name); }
    @Override public void buildDamage(int damage)              { sword.setDamage(damage); }
    @Override public void buildDurability(int durability)      { sword.setDurability(durability); }
    @Override public void buildEnchantments(List<String> ench) { sword.setEnchantments(ench); }

    @Override
    public Sword getResult() {
        return sword;
    }
}