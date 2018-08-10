package moe.pixelgirl.wirelesscommunication.common.item;
import moe.pixelgirl.wirelesscommunication.WirelessCommunication;
import net.minecraft.item.Item;

/**
 * WirelessCommunication
 * moe.pixelgirl.wirelesscommunication.common.item
 * Created by Pixel.
 */
public class ItemPortableTransceiver extends Item {
    public ItemPortableTransceiver(String unlocalisedName) {
        super();
        this.setUnlocalizedName(unlocalisedName).setTextureName(WirelessCommunication.MODID + ":" + unlocalisedName).setCreativeTab(WirelessCommunication.tabWirelessComm);
    }
}
