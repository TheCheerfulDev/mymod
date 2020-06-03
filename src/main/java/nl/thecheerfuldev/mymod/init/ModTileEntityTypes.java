package nl.thecheerfuldev.mymod.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import nl.thecheerfuldev.mymod.MyMod;
import nl.thecheerfuldev.mymod.blocks.QuarryBlock;
import nl.thecheerfuldev.mymod.tileentity.QuarryTileEntity;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MyMod.MOD_ID);

    public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY = TILE_ENTITY_TYPES.register(QuarryBlock.NAME, () -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.quarry).build(null));

}
