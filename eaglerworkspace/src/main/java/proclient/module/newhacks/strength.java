package proclient.module.misc;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionEffect;

public class SpeedMine extends Module {
  public SpeedMine() {
    super("Strength", KeyboardConstants.KEY_NONE, Category.NEWHACKS);
  }
  
  public void onEnable() {
    Minecraft.getMinecraft().thePlayer.addPotionEffect(new PotionEffect(5, 999999999, 675435334535));
  }
  
  public void onDisable() {
    Minecraft.getMinecraft().thePlayer.removePotionEffect(3);
  }
}
