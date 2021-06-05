package com.geolab.pojo.sand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应SandLoadTestRecords表：砂土记录表
 */
public class SandLoadTestRecords {
    private int ID;//序号
    private String Country;//国家
    private String Site;//地点
    private String PileID;//桩号，数据库中为Pile ID
    private String DataFrom;//来源，数据库中为Data From
    private String SoilType;//土层类型，数据库中为Soil Type
    private Double WaterTableDepth;//地下水高，数据库中为Water Table Depth (m)
    private String TypeOfConePeneTest;//CPT类型，数据库中为Type of Cone Penetrometer Testing
    private String PileType;//桩的开闭口情况
    private String PileShape;//桩的形状
    private String PileMaterial;//桩的材料
    private Double Length;//桩长，数据库中为Length (m)
    private Double OuterDiameter;//外直径，数据库中为Outer Diameter (mm)
    private Double WallThickness;//桩壁厚，数据库中为Wall Thickness (mm)
    private String InstallationMethod;//安装方式，数据库中为Installation method
    private String SetUpTime;//休止时间，数据库中为Set Up Time (day)
    private String TestType;//试验类型

    private Integer Qm;//测量总承载力
    private Integer Qs;//测量侧摩阻力
    private Integer Qb;//测量桩端阻力
    private Integer APIQc;//API方法算出的承载力，数据库中为API Qc
    private Double APIRatio;//APIQc/Qm，数据库中为API Qc/Qm
    private Integer UWAQc;//UWA方法算出的承载力，数据库中为UWA Qc
    private Double UWARatio;//UWAQc/Qm，数据库中为UWA Qc/Qm
    private Integer ICPQc;//ICP方法算出的承载力，数据库中为ICP Qc
    private Double ICPRatio;//ICPQc/Qm，数据库中为ICP Qc/Qm
    private Integer FugroQc;//Fugro方法算出的承载力，数据库中为Fugro Qc
    private Double FugroRatio;//FugroQc/Qm，数据库中为Fugro Qc/Qm
    private Integer NGIQc;//NGI方法算出的承载力，数据库中为NGI Qc
    private Double NGIRatio;//NGIQc/Qm，数据库中为NGI Qc/Qm

    private Double IFR;//IFR
    private String InterfaceAngle;//界面摩擦角，数据库中为Pile-soil Interface Friction Angle
    private String SoilUnitWeight;//土的重度，数据库中为Soil Unit Weight
    private String Reference;//参考文献

    private String InterfaceAngleNote;//界面摩擦角备注，数据库中为Interface Friction Angle Note
    private String SoilUnitWeightNote;//土的重度备注，数据库中为Soil Unit Weight Note
    private String qcNote;//qc备注，数据库中为qc Note
    private String LoadNote;//试验备注，数据库中为Load Note
}
