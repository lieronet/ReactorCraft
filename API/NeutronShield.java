/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.API;


/** Implement this on a block to make it shield neutrons. */
public interface NeutronShield {

	/** Return a percentage from 0-100. Args: Reactor Type. Types:

		DECAY: Randomly spat out by fueled cores
		FISSION: Generated by uranium fission reactions
		BREEDER: Generated by fuel breeding reactions
		FUSION: Generated by fusion reactions
		WASTE: Generated by spent fuel decay
		THORIUM: Generated by thorium fission reactions

	 */
	public double getAbsorptionChance(String type);


}