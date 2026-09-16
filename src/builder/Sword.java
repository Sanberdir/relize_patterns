package builder;

import java.util.ArrayList;
import java.util.List;

public class Sword {
    private final String name;
    private final int damage;
    private final int durability;
    private final List<String> enchantments;

    private Sword(Builder b) {
        this.name = b.name;
        this.damage = b.damage;
        this.durability = b.durability;
        this.enchantments = b.enchantments;
    }

    @Override
    public String toString() {
        return name + " (урон: " + damage +
                ", прочность: " + durability +
                ", зачарования: " + enchantments + ")";
    }

    public static class Builder {
        private final String name;
        private int damage = 1;
        private int durability = 100;
        private final List<String> enchantments = new ArrayList<>();

        public Builder(String name) {
            this.name = name;
        }

        public Builder damage(int d) {
            this.damage = d;
            return this;
        }

        public Builder durability(int d) {
            this.durability = d;
            return this;
        }

        public Builder enchant(String e) {
            enchantments.add(e);
            return this;
        }

        public Sword build() {
            return new Sword(this);
        }
    }
}