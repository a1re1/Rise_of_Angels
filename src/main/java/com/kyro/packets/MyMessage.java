package com.kyro.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MyMessage implements IMessage {
	  // A default constructor is always required
	  public MyMessage(){}

	  public static class MyMessageHandler implements IMessageHandler<MyMessage, IMessage> {
			// Do note that the default constructor is required, but implicitly defined in this case
			
			@Override 
			public IMessage onMessage(MyMessage message, MessageContext ctx) {
				 // This is the player the packet was sent to the server from
				 EntityPlayerMP serverPlayer = ((cpw.mods.fml.common.network.simpleimpl.MessageContext) ctx).getServerHandler().playerEntity;
				 // The value that was sent
				 int amount = message.toSend;
				 serverPlayer.inventory.addItemStackToInventory(new ItemStack(Items.diamond, amount));
				 // No response packet
				 return null;
			}

		}
	  
	  private int toSend;
	  public MyMessage(int toSend) {
	    this.toSend = toSend;
	  }

	  @Override public void toBytes(ByteBuf buf) {
	    // Writes the int into the buf
	    buf.writeInt(toSend);
	  }

	  @Override public void fromBytes(ByteBuf buf) {
	    // Reads the int back from the buf. Note that if you have multiple values, you must read in the same order you wrote.
	    toSend = buf.readInt();
	  }
	}