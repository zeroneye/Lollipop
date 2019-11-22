package zeroneye.lib.util.multiblock;

import net.minecraft.tileentity.ITickableTileEntity;
import zeroneye.lib.block.TileBase;

public interface IMultiBlockBuilder extends ITickableTileEntity {
    @SuppressWarnings("unchecked")
    default <T extends TileBase & IMultiBlockBuilder> T getBuilder() {
        return (T) this;
    }

    @Override
    default void tick() {

    }

    default boolean isAllSet() {


        return false;
    }

    MBPattern getPattern();
}