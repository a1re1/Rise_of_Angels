package com.kyro.functionality;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class godlyRating implements IExtendedEntityProperties{
	
	public final static String godRate = "Godliness";
	
	private String rating;
	
	private final EntityPlayer player;
	
	private int godRating, maxGodRating, minGodRating;
	
	/**
	 * God Rating is a measure of godliness, min and max are both max demon and max angelic static respectively.
	 * @param player, character
	 */
	public godlyRating(EntityPlayer player){
		this.player = player;
		this.godRating = 0;
		this.maxGodRating = 300;
		this.minGodRating = -300;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(godlyRating.godRate, new godlyRating(player));
	}
	
	public static final godlyRating get(EntityPlayer player)
	{
		return (godlyRating) player.getExtendedProperties(godRate);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {

		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setInteger("godRating", this.godRating);
		properties.setInteger("maxGodRating", this.maxGodRating);
		properties.setInteger("minGodRating", this.minGodRating);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(godRate);
		
		// Get our data from the custom tag compound
		this.godRating = properties.getInteger("CurrentMana");
		this.maxGodRating = properties.getInteger("maxGodRating");
		this.minGodRating = properties.getInteger("minGodRating");

		System.out.println("God Rating" + this.godRating + "/" + this.maxGodRating);
		
	}

	@Override
	public void init(Entity entity, World world) {
		
	}
	
	/**
	 * Adds ant int to a player's god rating(negative demon, positive angel)
	 * @param amount
	 * @return whether event succeeds
	 */
	public boolean addRating(int amount){
		
		//Check that player is not above or below max and min respectively
		boolean sufficient = amount + this.godRating <= this.maxGodRating || amount + godRating >= this.minGodRating;
		System.out.println("Attempting to add " + amount +" godliness to " + player);
		// add rating
		if(amount + this.godRating <= this.maxGodRating && amount + this.godRating >0){//Angel
			this.godRating += amount;
		}
		else if(amount + this.godRating >= this.minGodRating && amount + this.godRating < 0){//Demon
			this.godRating += amount;
			_demonClass();
			/*
			 * TODO: figure out a better system of handling then creating a new demonHood each event.
			 */
			
		}
		else{//UnHoly
			this.godRating += amount;
		}
		
		// Return if the player stat changed
		return sufficient;
	}
	
	/**
	 * Resets a player's godliness, administrative function
	 */
	public void resetGodliness()
	{
		this.godRating = 0;
	}
	
	/**
	 * Function to get godRating
	 */
	public int getGodRating(){
		return godRating;
	}
	
	/**
	 * Demonic Perks
	 */
	private void _demonClass(){

		if(godRating<0 && godRating>=-10){
			rating = "D";
			gradeD();
		}
		else if(godRating<-10 && godRating>=-20){
			rating = "C";
			gradeC();
		}
		else if(godRating<-20 && godRating>=-50){
			rating = "B";
			gradeB();
		}
		else if(godRating<-50 && godRating>=-99){
			rating = "A";
			gradeA();
		}
		else if(godRating<-99){
			rating = "S";
			gradeS();
		}
		else{
			rating = "Not a demon...";
		}
	}
	
	/**
	 * Demon ranks
	 */
	public void gradeS(){
		
		player.capabilities.allowFlying=true;
		System.out.println("rating: " + godRating);
		
	}
	
	public void gradeA(){
		
		
	}
	
	public void gradeB(){
		
		
	}
	
	public void gradeC(){
		
		
	}
	
	public void gradeD(){
		
		
	}
	
	
	/**
	 * Angelic Perks
	 */
	
	private void _angelClass(){

		if(godRating>0 && godRating<=10){
			rating = "D";
			gradeDa();
		}
		else if(godRating>10 && godRating<=20){
			rating = "C";
			gradeCa();
		}
		else if(godRating>20 && godRating<=50){
			rating = "B";
			gradeBa();
		}
		else if(godRating>50 && godRating<=99){
			rating = "A";
			gradeAa();
		}
		else if(godRating>99){
			rating = "S";
			gradeSa();
		}
		else{
			rating = "Not an angel...";
		}
	}
	
	/**
	 * Angel ranks
	 */
	public void gradeSa(){
		
		player.capabilities.allowFlying=true;
		System.out.println("rating: " + godRating);
		
	}
	
	public void gradeAa(){
		
		
	}
	
	public void gradeBa(){
		
		
	}
	
	public void gradeCa(){
		
		
	}
	
	public void gradeDa(){
		
		
	}

}
