package com.mcylm.coi.realm.enums;

import com.mcylm.coi.realm.utils.SkullUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * 建筑类型
 */
@Getter
@AllArgsConstructor
public class COIBuildingType {
    // BASE
    public static final COIBuildingType BASE = new COIBuildingType (
            "BASE",
                    "大本营",
                    new ItemStack(Material.BEACON),
            """
            大本营是整个小队的复活点,也是最重要的建筑,
            如果大本营被拆掉了,则小队就输了,请务必保护好本建筑""",
                    5,
                    5L
                    );

    // MILL
    public static final COIBuildingType MILL = new COIBuildingType (
            "MILL",
            "磨坊",
            SkullUtils.createPlayerHead(COIHeadType.FARMER.getTextures()),
            """
            磨坊是食物收集类建筑.全自动生产面包到箱子中.
            请注意:每个NPC都需要食物补充能量,磨坊的是非常重要的建筑""",
            5,
            5L
    );

    // STOPE
    public static final COIBuildingType STOPE = new COIBuildingType (
            "STOPE",
            "矿场",
            SkullUtils.createPlayerHead(COIHeadType.MINER.getTextures()),
            """
            矿场是资源收集类建筑.全自动生产绿宝石到箱子中
            收集的资源可用于建造新的建筑,或者给战士制作装备.""",
            5,
            5L
    );

    // MILITARY_CAMP
    public static final COIBuildingType MILITARY_CAMP = new COIBuildingType (
            "MILITARY_CAMP",
            "军营",
            SkullUtils.createPlayerHead(COIHeadType.SOLDIER.getTextures()),
            """
            兵营是战斗类建筑,建造完成后会生成一个战士,
            战士会默认自动巡逻,当发现敌方战士或者是敌方建筑时,
            会自动攻击敌方单位""",
            5,
            5L
    );

    // WALL_NORMAL
    public static final COIBuildingType WALL_NORMAL = new COIBuildingType (
            "WALL_NORMAL",
            "普通城墙",
            new ItemStack(Material.BRICK_WALL),
            """
            城墙是防卫类建筑,需要建造多个城墙点来保卫建筑""",
            5,
            5L
    );

    // DOOR_NORMAL
    public static final COIBuildingType DOOR_NORMAL = new COIBuildingType (
            "DOOR_NORMAL",
            "城门",
            new ItemStack(Material.IRON_DOOR),
            """
            城门是防卫类建筑""",
            5,
            5L
    );

    public static final COIBuildingType BRIDGE = new COIBuildingType (
            "BRIDGE",
            "桥",
            new ItemStack(Material.STONE_BRICK_WALL),
            """
            可以建造一座桥在两个空岛之间""",
            5,
            5L
    );

    // TURRET_NORMAL
    public static final COIBuildingType TURRET_NORMAL = new COIBuildingType (
            "TURRET",
            "基础防御炮塔",
            SkullUtils.createPlayerHead(COIHeadType.KILL.getTextures()),
            """
            防御炮塔会消耗子弹自动检测30格范围内的敌方单位,并自动攻击.""",
            5,
            5L
    );

    // TURRET_REPAIR
    public static final COIBuildingType TURRET_REPAIR = new COIBuildingType (
            "REPAIR",
            "维修塔",
            SkullUtils.createPlayerHead(COIHeadType.REPAIR.getTextures()),
            """
            会消耗子弹自动给30格范围内友方单位回血""",
            5,
            5L
    );

    // 防空塔
    public static final COIBuildingType TURRET_AIR_RAID = new COIBuildingType (
            "AIR_RAID",
            "防空塔",
            SkullUtils.createPlayerHead(COIHeadType.KILL.getTextures()),
            """
            防御炮塔会消耗子弹自动检测50格范围内的空中飞行单位,并自动攻击.""",
            5,
            5L
    );

    // FORGE
    public static final COIBuildingType FORGE = new COIBuildingType (
            "FORGE",
            "铁匠铺",
            new ItemStack(Material.ANVIL),
            """
            自动给友方的战士打造装备，右键可以购买道具""",
            5,
            5L
    );

    // MONSTER_BASE
    public static final COIBuildingType MONSTER_BASE = new COIBuildingType (
            "MONSTER_BASE",
            "怪物营地",
            new ItemStack(Material.BEACON),
            """
            怪物的复活点
            """,
            5,
            5L
    );

    // CODE
    private String code;
    // 建筑名称 building name
    private String name;
    // GUI显示的材质
    private ItemStack itemType;
    // 建筑介绍
    private String introduce;
    // 每次建筑几个方块
    // blocks number per build
    private int unit;
    // 几tick建造一次
    private long interval;


}
