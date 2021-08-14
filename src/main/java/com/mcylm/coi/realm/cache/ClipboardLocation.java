package com.mcylm.coi.realm.cache;

import com.mcylm.coi.realm.tools.building.COIStructure;
import lombok.Data;
import org.bukkit.Location;

@Data
public class ClipboardLocation {

    //选取的第一个点
    private Location firstPoint;
    //选取的第二个点
    private Location secondPoint;
    //COI结构体
    private COIStructure structure;

}
