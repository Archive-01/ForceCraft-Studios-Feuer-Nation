package mrbysco.forcecraft.container.slot;

import mrbysco.forcecraft.tiles.InfuserTileEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class SlotModifiers extends SlotItemHandler {
    public SlotModifiers(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return InfuserTileEntity.validModifierList.contains(stack.getItem());
    }

    @Override
    public int getItemStackLimit(@Nonnull ItemStack stack) {
        return 1;
    }

}
