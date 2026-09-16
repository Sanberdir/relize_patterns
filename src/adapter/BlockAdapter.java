package adapter;

public class BlockAdapter implements NewBlock {
    private final OldBlock oldBlock;

    public BlockAdapter(OldBlock oldBlock) {
        this.oldBlock = oldBlock;
    }

    @Override
    public void place() {
        oldBlock.spawnLegacy();
        System.out.println("Адаптер: блок " + oldBlock.getType() + " успешно поставлен в мире");
    }
}