package lib.network.playerdata;

import com.kyro.riseofangels.RiseOfAngels;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public abstract class PacketSyncGodliness implements IMessage, IMessageHandler<PacketSyncGodliness, IMessage> {
    protected int data = 0;
    
    public PacketSyncGodliness(){
    	
    }

    public PacketSyncGodliness(EntityPlayer player) {
    	this.data = RiseOfAngels.proxy.getGodliness(player).getGodRating();
    }

    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(this.data);
    }

    public void fromBytes(ByteBuf buffer) {
        this.data = buffer.readInt();
    }

    @SideOnly(Side.SERVER)
    public IMessage onMessage(PacketSyncGodliness message, MessageContext ctx) {
    	EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        RiseOfAngels.proxy.getGodliness(player).getRating();
        return null;
    }


}