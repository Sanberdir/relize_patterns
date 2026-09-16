import adapter.BlockAdapter;
import adapter.NewBlock;
import adapter.OldBlock;
import builder.DiamondSwordBuilder;
import builder.NetheriteSwordBuilder;
import builder.Sword;
import builder.SwordDirector;
import chain.ArmorHandler;
import chain.DamageHandler;
import chain.HealthHandler;
import chain.ShieldHandler;
import decorator.FireEnchantment;
import decorator.IronSword;
import decorator.SharpnessEnchantment;
import proxy.Chest;
import proxy.ChestProxy;
import strategy.BowAttack;
import strategy.PotionAttack;
import strategy.SwordAttack;
import strategy.Warrior;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. STRATEGY ===");
        steveStrategy();

        System.out.println("\n=== 2. CHAIN OF RESPONSIBILITY ===");
        steveChain();

        System.out.println("\n=== 3. BUILDER ===");
        steveBuilder();

        System.out.println("\n=== 4. PROXY ===");
        steveProxy();

        System.out.println("\n=== 5. DECORATOR ===");
        steveDecorator();

        System.out.println("\n=== 6. ADAPTER ===");
        steveAdapter();
    }

    static void steveStrategy() {
        Warrior steve = new Warrior();
        steve.setStrategy(new SwordAttack());
        steve.attack();
        steve.setStrategy(new BowAttack());
        steve.attack();
        steve.setStrategy(new PotionAttack());
        steve.attack();
    }

    static void steveChain() {
        DamageHandler armor = new ArmorHandler(5);
        DamageHandler shield = new ShieldHandler();
        DamageHandler health = new HealthHandler(20);

        armor.setNext(shield).setNext(health);

        System.out.println("--- Удар на 15 ---");
        boolean handled = armor.handle(15);
        System.out.println("Обработано? " + handled);

        System.out.println("\n--- Удар на 3 (броня всё съест) ---");
        handled = armor.handle(3);
        System.out.println("Обработано? " + handled);

        System.out.println("\n--- Удар на 100 (смертельный) ---");
        handled = armor.handle(100);
        System.out.println("Обработано? " + handled);
    }

    static void steveBuilder() {
        SwordDirector director = new SwordDirector();

        Sword diamond = director.buildEnchantedDiamondSword(new DiamondSwordBuilder());
        Sword netherite = director.buildSimpleNetheriteSword(new NetheriteSwordBuilder());

        System.out.println(diamond);
        System.out.println(netherite);
    }

    static void steveProxy() {
        Chest chest = new ChestProxy("Стив");
        chest.open("Стив");
        chest.open("Херобрин");
    }

    static void steveDecorator() {
        IronSword sword = new IronSword();
        sword = new FireEnchantment(sword);
        sword = new SharpnessEnchantment(sword);

        System.out.println("Урон: " + sword.getDamage());
        System.out.println("Описание: " + sword.getDescription());
    }

    static void steveAdapter() {
        OldBlock oldStone = new OldBlock("Камень");
        NewBlock modernBlock = new BlockAdapter(oldStone);
        modernBlock.place();
    }
}