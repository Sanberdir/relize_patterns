package builder;

import java.util.ArrayList;
import java.util.List;

public class Sword {
    private String name;
    private int damage;
    private int durability;
    private List<String> enchantments = new ArrayList<>();

    public void setName(String name)                 { this.name = name; }
    public void setDamage(int damage)                { this.damage = damage; }
    public void setDurability(int durability)        { this.durability = durability; }
    public void setEnchantments(List<String> ench)   { this.enchantments = ench; }

    @Override
    public String toString() {
        return name + " (урон: " + damage +
                ", прочность: " + durability +
                ", зачарования: " + enchantments + ")";
    }
}