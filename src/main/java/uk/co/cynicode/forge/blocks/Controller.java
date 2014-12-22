package uk.co.cynicode.forge.blocks;
/**
 * Copyright 2014 M. D. Ball (m.d.ball2@ncl.ac.uk)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import uk.co.cynicode.forge.blocks.blocks.TarmacBlock;
import uk.co.cynicode.forge.blocks.fluids.TarFluid;
import uk.co.cynicode.forge.blocks.liquids.TarLiquid;
import uk.co.cynicode.forge.reference.Names;

/**
 * Class Name - Controller
 * Package - uk.co.cynicode.forge.blocks
 * Desc of Class - ...
 * Author(s) - M. D. Ball
 * Last Mod: 22/12/2014
 */
public class Controller {

	public static Block tarmacBlock = new TarmacBlock();
	public static Fluid tarFluid = new TarFluid(Names.Blocks.TAR);
	public static Block tarLiquid;

	public static void creation() {
		GameRegistry.registerBlock(tarmacBlock, Names.Blocks.TARMAC);
		FluidRegistry.registerFluid(tarFluid);
		tarLiquid = new TarLiquid(tarFluid);
		GameRegistry.registerBlock(tarLiquid, tarFluid.getUnlocalizedName());
	}

}