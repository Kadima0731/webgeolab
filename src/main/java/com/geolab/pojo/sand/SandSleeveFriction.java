package com.geolab.pojo.sand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应Sand Sleeve Friction表：砂土的摩擦力曲线
 */
public class SandSleeveFriction {
    private int ID;//表中ID，无实际用处
    private int RecordID;//对应砂土数据库的ID，数据库中为Record ID
    private double Depth;//深度
    private double fs;//摩擦力
}
