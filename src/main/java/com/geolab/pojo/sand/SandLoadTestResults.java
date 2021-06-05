package com.geolab.pojo.sand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应Sand Load Test Results表：砂土的荷载-位移曲线
 */
public class SandLoadTestResults {
    private int ID;//表中ID，无实际用处
    private int RecordID;//对应砂土数据库的ID，数据库中为Record ID
    private double Load;//荷载，数据库中为Load (kN)
    private double Settlement;//位移，数据库中为Settlement of Pile Head (mm)
}
