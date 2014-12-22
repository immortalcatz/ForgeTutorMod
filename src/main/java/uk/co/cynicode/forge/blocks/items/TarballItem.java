package uk.co.cynicode.forge.blocks.items;
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

import net.minecraft.creativetab.CreativeTabs;
import uk.co.cynicode.forge.reference.Names;

/**
 * Class Name - TarballItem
 * Package - uk.co.cynicode.forge.blocks.items
 * Desc of Class - ...
 * Author(s) - M. D. Ball
 * Last Mod: 22/12/2014
 */
public class TarballItem extends TutorItem {

	public TarballItem() {
		super(Names.Blocks.TARBALL);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}