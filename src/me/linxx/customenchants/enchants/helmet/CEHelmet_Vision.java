package me.linxx.customenchants.enchants.helmet;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;


public class CEHelmet_Vision extends Enchantment {

	public CEHelmet_Vision( int id ) {
		super( id );
	}

	@Override
	public boolean canEnchantItem( ItemStack arg0 ) {
		if ( arg0.getType() == Material.LEATHER_HELMET || arg0.getType() == Material.IRON_HELMET
				|| arg0.getType() == Material.GOLD_HELMET || arg0.getType() == Material.DIAMOND_HELMET
				|| arg0.getType() == Material.CHAINMAIL_HELMET ) {
			return true;
		}
		return false;
	}

	@Override
	public boolean conflictsWith( Enchantment arg0 ) {
		return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		return null;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public String getName() {
		return "Vision";
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

}
