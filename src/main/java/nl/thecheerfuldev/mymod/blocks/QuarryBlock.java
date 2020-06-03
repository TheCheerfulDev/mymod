package nl.thecheerfuldev.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import nl.thecheerfuldev.mymod.init.ModTileEntityTypes;

import javax.annotation.Nullable;

public class QuarryBlock extends Block {

    public static final String NAME = "quarry";

    public QuarryBlock() {
        super(Properties.create(Material.IRON));
        this.setRegistryName(NAME);
    }

    @Override
    public boolean hasTileEntity(final BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
        return ModTileEntityTypes.QUARRY.get().create();
    }
}
