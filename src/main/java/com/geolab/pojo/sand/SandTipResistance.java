package com.geolab.pojo.sand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应Sand Tip Resistance表：砂土的qc曲线
 */
public class SandTipResistance {
    private int ID;//表中ID，无实际用处
    private int RecordID;//对应砂土数据库的ID，数据库中为Record ID
    private double Depth;//深度
    private double qc;//qc
}
