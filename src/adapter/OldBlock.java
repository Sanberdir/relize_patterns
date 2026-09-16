package adapter;

public class OldBlock {
    private final String type;

    public OldBlock(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void spawnLegacy() {
        System.out.println("Старый метод: спавн блока " + type);
    }
}