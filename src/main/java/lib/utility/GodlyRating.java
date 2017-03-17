package lib.utility;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class GodlyRating implements IExtendedEntityProperties{
	
	public final static String godRate = "Godliness";
	private String rating;
	public final static Map<UUID, Integer> godliness = new HashMap();
	private EntityPlayer player;
	private int godRating, maxGodRating, minGodRating;
	
	/**
	 * God Rating is a measure of godliness, min and max are both max demon and max angelic static respectively.
	 * @param player, character
	 */
	public GodlyRating(EntityPlayer player){
		this.player = player;
		if(godliness.containsKey(player.getUniqueID()))
			this.godRating = godliness.get(player.getUniqueID());
		else{
			this.godRating = 0;
			godliness.put(player.getUniqueID(), this.godRating);
		}
		this.maxGodRating = 300;
		this.minGodRating = -300;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(GodlyRating.godRate, new GodlyRating(player));
	}
	
	public static final GodlyRating get(EntityPlayer player)
	{
		return (GodlyRating) player.getExtendedProperties(godRate);
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
		this.godRating = properties.getInteger("godRating");
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
	public int addRating(int amount){
		
		//Check that player is not above or below max and min respectively
		System.out.println("[RoA]Attempting to add " + amount +" godliness to " + player);
		// add rating
		if(amount + this.godRating >0){//Angel
			//System.out.println(this.godRating);
			godliness.put(player.getUniqueID(), this.godRating + amount);
			_angelClass();
		}
		else if(amount + this.godRating < 0){//Demon
			//System.out.println(this.godRating);
			godliness.put(player.getUniqueID(), this.godRating + amount);
			_demonClass();
		}
		else{//UnHoly
			//System.out.println(this.godRating);
			godliness.put(player.getUniqueID(), this.godRating + amount);
		}
		
		return godliness.get(player.getUniqueID());
	}
	
	/**
	 * Resets a player's godliness, administrative function
	 */
	public void resetGodliness()
	{
		this.godRating = 0;
		godliness.put(player.getUniqueID(), this.godRating);
	}
	
	/**
	 * Function to get godRating
	 */
	public int getGodRating(){
		godRating = godliness.get(player.getUniqueID());
		return godRating;
	}
	
	/**
	 * Get Rating
	 */
	public String getRating(){
		getGodRating();
		if(godRating > 0){
			_angelClass();
		}
		else if(godRating < 0){
			_demonClass();
		}
		else{
			rating = "Unrated";
		}
		return rating;
	}
	
	/**
	 * Demonic Perks
	 */
	private String _demonClass(){
		
		godRating = godliness.get(player.getUniqueID());
		
		if(godRating<0 && godRating>=-10){
			rating = "Demon Class: D";
			gradeD();
		}
		else if(godRating<-10 && godRating>=-20){
			rating = "Demon Class: C";
			gradeC();
		}
		else if(godRating<-20 && godRating>=-50){
			rating = "Demon Class: B";
			gradeB();
		}
		else if(godRating<-50 && godRating>=-99){
			rating = "Demon Class: A";
			gradeA();
		}
		else if(godRating<-99){
			rating = "Demon Class: S";
			gradeS();
		}
		else{
			rating = "Unrated";
		}
		
		return rating;
		
	}
	
	/**
	 * Demon ranks
	 */
	private void gradeS(){
		
		player.capabilities.allowFlying=true;
		System.out.println("rating: " + godRating);
		
	}
	
	private void gradeA(){
		
		
	}
	
	private void gradeB(){
		
		
	}
	
	private void gradeC(){
		
		
	}
	
	private void gradeD(){
		
		
	}
	
	
	/**
	 * Angelic Perks
	 */
	
	private String _angelClass(){
		
		godRating = godliness.get(player.getUniqueID());

		if(godRating>0 && godRating<=10){
			rating = "Angel Grade: D";
			gradeDa();
		}
		else if(godRating>10 && godRating<=20){
			rating = "Angel Grade: C";
			gradeCa();
		}
		else if(godRating>20 && godRating<=50){
			rating = "Angel Grade: B";
			gradeBa();
		}
		else if(godRating>50 && godRating<=99){
			rating = "Angel Grade: A";
			gradeAa();
		}
		else if(godRating>99){
			rating = "Angel Grade: S";
			gradeSa();
		}
		else{
			rating = "Unrated";
		}
		
		return rating;
		
	}
	
	/**
	 * Angel ranks
	 */
	private void gradeSa(){
		
		player.capabilities.allowFlying=true;
		System.out.println("rating: " + godRating);
		
	}
	
	private void gradeAa(){
		
		
	}
	
	private void gradeBa(){
		
		
	}
	
	private void gradeCa(){
		
		
	}
	
	private void gradeDa(){
		
		
	}

}
