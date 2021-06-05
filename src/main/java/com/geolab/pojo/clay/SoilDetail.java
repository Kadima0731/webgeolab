package com.geolab.pojo.clay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应Soil Detail表：黏土的场地信息
 */
public class SoilDetail {
    private int ID;//对应黏土数据库的ID
    private String Detail;//土层信息，数据库中为Soil Detail
}
