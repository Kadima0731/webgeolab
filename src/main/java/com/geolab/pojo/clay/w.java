package com.geolab.pojo.clay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应w表：黏土的含水率
 */
public class w {
    private int ID;//表中ID，无实际用处
    private int RecordID;//对应黏土数据库的ID，数据库中为Record ID
    private double Depth;//深度
    private double w;//黏土的含水率
}
