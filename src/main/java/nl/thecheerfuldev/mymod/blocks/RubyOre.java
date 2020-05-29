package nl.thecheerfuldev.mymod.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class RubyOre extends OreBlock {

    public static final String NAME = "ruby_ore";

    public RubyOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5F, 6F)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));

        this.setRegistryName(NAME);
    }

    @Override
    public void onBlockHarvested(final World worldIn, final BlockPos pos, final BlockState state, final PlayerEntity player) {
        this.dropXpOnBlockBreak(worldIn, pos, 0);
        if (player.getHeldItemMainhand().getHarvestLevel(ToolType.PICKAXE, player, state) < state.getHarvestLevel()) {
            return;
        }
        for (final ToolType toolType : player.getHeldItemMainhand().getToolTypes()) {
            if (toolType.equals(state.getHarvestTool())) {
                this.dropXpOnBlockBreak(worldIn, pos, 1);
                break;
            }
        }
    }

    @Override
    public void spawnAdditionalDrops(final BlockState state, final World worldIn, final BlockPos pos, final ItemStack stack) {
        if (willEntitySpawn()) {
            final EndermanEntity enderman = EntityType.ENDERMAN.create(worldIn);
            enderman.setPosition(pos.getX(), pos.getY(), pos.getZ());
            final ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FLINT));
            worldIn.addEntity(enderman);
            worldIn.addEntity(itemEntity);
            enderman.spawnExplosionParticle();
        }
    }

    private boolean willEntitySpawn() {
        return false;
    }
}
