
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 5

> CHANGE  5 : 6  @  5 : 6

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;

> CHANGE  1 : 2  @  1 : 2

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;

> INSERT  1 : 6  @  1

+ 
+ import com.google.common.base.Predicate;
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Sets;
+ 

> INSERT  8 : 9  @  8

+ import net.minecraft.client.Minecraft;

> INSERT  4 : 5  @  4

+ import net.minecraft.entity.EntityLivingBase;

> DELETE  6  @  6 : 7

> DELETE  12  @  12 : 27

> DELETE  1  @  1 : 2

> DELETE  3  @  3 : 4

> CHANGE  18 : 19  @  18 : 19

~ 	protected int updateLCG = (new EaglercraftRandom()).nextInt();

> CHANGE  6 : 7  @  6 : 7

~ 	public final EaglercraftRandom rand = new EaglercraftRandom();

> DELETE  7  @  7 : 8

> DELETE  3  @  3 : 4

> INSERT  10 : 13  @  10

+ 		if (!client) {
+ 			throw new IllegalStateException("Singleplayer is unavailable because all of it's code was deleted");
+ 		}

> DELETE  8  @  8 : 9

> CHANGE  12 : 13  @  12 : 13

~ 				return chunk.getBiome(pos);

> CHANGE  11 : 12  @  11 : 12

~ 			return BiomeGenBase.plains;

> DELETE  3  @  3 : 7

> DELETE  54  @  54 : 62

> DELETE  36  @  36 : 38

> CHANGE  15 : 16  @  15 : 16

~ 				if ((flags & 2) != 0 && ((flags & 4) == 0) && chunk.isPopulated()) {

> DELETE  3  @  3 : 10

> CHANGE  36 : 37  @  36 : 40

~ 		this.notifyNeighborsOfStateChange(pos, blockType);

> DELETE  67  @  67 : 69

> DELETE  1  @  1 : 21

> CHANGE  117 : 118  @  117 : 118

~ 			return Chunk.getNoSkyLightValue();

> INSERT  896 : 927  @  896

+ 		int fastMathSetting = Minecraft.getMinecraft().gameSettings.fastMath;
+ 		if (fastMathSetting > 0) {
+ 			double posPrec = fastMathSetting == 2 ? 256.0 : 1024.0;
+ 			float rotPrec = fastMathSetting == 2 ? 64.0f : 128.0f;
+ 			double velPrec = fastMathSetting == 2 ? 2048.0 : 4096.0;
+ 			entityIn.lastTickPosX = (long) (entityIn.lastTickPosX * posPrec) / posPrec;
+ 			entityIn.lastTickPosY = (long) (entityIn.lastTickPosY * posPrec) / posPrec;
+ 			entityIn.lastTickPosZ = (long) (entityIn.lastTickPosZ * posPrec) / posPrec;
+ 			entityIn.prevPosX = (int) (entityIn.prevPosX * posPrec) / posPrec;
+ 			entityIn.prevPosY = (int) (entityIn.prevPosY * posPrec) / posPrec;
+ 			entityIn.prevPosZ = (int) (entityIn.prevPosZ * posPrec) / posPrec;
+ 			entityIn.posX = (int) (entityIn.posX * posPrec) / posPrec;
+ 			entityIn.posY = (int) (entityIn.posY * posPrec) / posPrec;
+ 			entityIn.posZ = (int) (entityIn.posZ * posPrec) / posPrec;
+ 			entityIn.prevRotationPitch = (int) (entityIn.prevRotationPitch * rotPrec) / rotPrec;
+ 			entityIn.prevRotationYaw = (int) (entityIn.prevRotationYaw * rotPrec) / rotPrec;
+ 			entityIn.rotationPitch = (int) (entityIn.rotationPitch * rotPrec) / rotPrec;
+ 			entityIn.rotationYaw = (int) (entityIn.rotationYaw * rotPrec) / rotPrec;
+ 			if (entityIn instanceof EntityLivingBase) {
+ 				EntityLivingBase l = (EntityLivingBase) entityIn;
+ 				l.prevRotationYawHead = (int) (l.prevRotationYawHead * rotPrec) / rotPrec;
+ 				l.rotationYawHead = (int) (l.rotationYawHead * rotPrec) / rotPrec;
+ 				l.prevRenderYawOffset = (int) (l.prevRenderYawOffset * rotPrec) / rotPrec;
+ 				l.renderYawOffset = (int) (l.renderYawOffset * rotPrec) / rotPrec;
+ 				l.prevRotationPitch = (int) (l.prevRotationPitch * rotPrec) / rotPrec;
+ 				l.rotationPitch = (int) (l.rotationPitch * rotPrec) / rotPrec;
+ 			}
+ 			entityIn.motionX = (int) (entityIn.motionX * velPrec) / velPrec;
+ 			entityIn.motionY = (int) (entityIn.motionY * velPrec) / velPrec;
+ 			entityIn.motionZ = (int) (entityIn.motionZ * velPrec) / velPrec;
+ 		}

> DELETE  390  @  390 : 448

> DELETE  40  @  40 : 64

> CHANGE  8 : 9  @  8 : 9

~ 	public void forceBlockUpdateTick(Block blockType, BlockPos pos, EaglercraftRandom random) {

> DELETE  231  @  231 : 235

> CHANGE  28 : 29  @  28 : 29

~ 			if (entityType.isAssignableFrom(entity.getClass()) && filter.apply((T) entity)) {

> CHANGE  10 : 12  @  10 : 12

~ 		for (EntityPlayer entity : this.playerEntities) {
~ 			if (playerType.isAssignableFrom(entity.getClass()) && filter.apply((T) entity)) {

> CHANGE  232 : 233  @  232 : 233

~ 	public EntityPlayer getPlayerEntityByUUID(EaglercraftUUID uuid) {

> CHANGE  197 : 198  @  197 : 198

~ 	public EaglercraftRandom setRandomSeed(int parInt1, int parInt2, int parInt3) {

> CHANGE  52 : 53  @  52 : 53

~ 			this.theCalendar.setTimeInMillis(System.currentTimeMillis());

> DELETE  67  @  67 : 71

> EOF
