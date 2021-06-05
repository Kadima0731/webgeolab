package com.geolab.pojo.clay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应γ表：黏土的重度
 */
public class γ {
    private int ID;//表中ID，无实际用处
    private int RecordID;//对应黏土数据库的ID，数据库中为Record ID
    private double Depth;//深度
    private double γ;//黏土的重度
}
