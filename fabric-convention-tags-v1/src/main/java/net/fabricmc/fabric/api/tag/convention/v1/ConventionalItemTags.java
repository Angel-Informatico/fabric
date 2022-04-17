/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.fabric.api.tag.convention.v1;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;

import net.fabricmc.fabric.impl.tag.convention.TagRegistration;

/**
 * See {@link net.minecraft.tag.ItemTags} for vanilla tags.
 * Note that addition to some vanilla tags implies having certain functionality.
 */
public class ConventionalItemTags {
	// Tool tags
	public static final TagKey<Item> PICKAXES = register("pickaxes");
	public static final TagKey<Item> SHOVELS = register("shovels");
	public static final TagKey<Item> HOES = register("hoes");
	public static final TagKey<Item> AXES = register("axes");
	public static final TagKey<Item> SHEARS = register("shears");
	/**
	 * For throwable weapons, like Minecraft tridents.
	 */
	public static final TagKey<Item> SPEARS = register("spears");
	public static final TagKey<Item> SWORDS = register("swords");
	public static final TagKey<Item> BOWS = register("bows");
	// Ores and ingots
	public static final TagKey<Item> IRON_INGOTS = register("iron_ingots");
	public static final TagKey<Item> RAW_IRON_ORES = register("raw_iron_ores");
	public static final TagKey<Item> RAW_IRON_BLOCKS = register("raw_iron_blocks");
	public static final TagKey<Item> RAW_GOLD_ORES = register("raw_gold_ores");
	public static final TagKey<Item> RAW_GOLD_BLOCKS = register("raw_gold_blocks");
	public static final TagKey<Item> GOLD_INGOTS = register("gold_ingots");
	public static final TagKey<Item> REDSTONE_DUSTS = register("redstone_dusts");
	public static final TagKey<Item> COPPER_INGOTS = register("copper_ingots");
	public static final TagKey<Item> RAW_COPPER_ORES = register("raw_copper_ores");
	public static final TagKey<Item> RAW_COPPER_BLOCKS = register("raw_copper_blocks");
	public static final TagKey<Item> ORES = register("ores");
	public static final TagKey<Item> NETHERITE_INGOTS = register("netherite_ingots");
	public static final TagKey<Item> QUARTZ_ORES = register("quartz_ores");
	public static final TagKey<Item> QUARTZ = register("quartz");
	public static final TagKey<Item> LAPIS = register("lapis");
	public static final TagKey<Item> DIAMONDS = register("diamonds");
	public static final TagKey<Item> EMERALDS = register("emeralds");
	public static final TagKey<Item> COAL = register("coal");
	// Consumables
	public static final TagKey<Item> FOODS = register("foods");
	public static final TagKey<Item> POTIONS = register("potions");
	// Buckets
	public static final TagKey<Item> WATER_BUCKET = register("bucket/water");
	public static final TagKey<Item> LAVA_BUCKET = register("bucket/lava");
	public static final TagKey<Item> MILK_BUCKET = register("bucket/milk");
	public static final TagKey<Item> EMPTY_BUCKET = register("bucket/empty");

	public static final TagKey<Item> GLASS_BLOCKS = register("glass_blocks");
	public static final TagKey<Item> GLASS_PANES = register("glass_panes");

	public static final TagKey<Item> SHULKER_BOXES = register("shulker_boxes");

	// Dyes
	public static final TagKey<Item> DYES = register("dyes");
	public static final TagKey<Item> BLACK_DYES = register("black_dyes");
	public static final TagKey<Item> BLUE_DYES = register("blue_dyes");
	public static final TagKey<Item> BROWN_DYES = register("brown_dyes");
	public static final TagKey<Item> CYAN_DYES = register("cyan_dyes");
	public static final TagKey<Item> GRAY_DYES = register("gray_dyes");
	public static final TagKey<Item> GREEN_DYES = register("green_dyes");
	public static final TagKey<Item> LIGHT_BLUE_DYES = register("light_blue_dyes");
	public static final TagKey<Item> LIGHT_GRAY_DYES = register("light_gray_dyes");
	public static final TagKey<Item> LIME_DYES = register("lime_dyes");
	public static final TagKey<Item> MAGENTA_DYES = register("magenta_dyes");
	public static final TagKey<Item> ORANGE_DYES = register("orange_dyes");
	public static final TagKey<Item> PINK_DYES = register("pink_dyes");
	public static final TagKey<Item> PURPLE_DYES = register("purple_dyes");
	public static final TagKey<Item> RED_DYES = register("red_dyes");
	public static final TagKey<Item> WHITE_DYES = register("white_dyes");
	public static final TagKey<Item> YELLOW_DYES = register("yellow_dyes");

	private static TagKey<Item> register(String tagID) {
		return TagRegistration.ITEM_TAG_REGISTRATION.registerCommon(tagID);
	}
}