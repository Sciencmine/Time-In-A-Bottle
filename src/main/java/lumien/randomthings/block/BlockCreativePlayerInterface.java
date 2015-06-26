package lumien.randomthings.block;

import lumien.randomthings.tileentity.TileEntityCreativePlayerInterface;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCreativePlayerInterface extends BlockContainerBase
{
	protected BlockCreativePlayerInterface()
	{
		super("creativePlayerInterface", Material.rock);

		this.setStepSound(soundTypeStone);
		this.setHardness(4.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityCreativePlayerInterface();
	}

	@Override
	public int getRenderType()
	{
		return 3;
	}
}