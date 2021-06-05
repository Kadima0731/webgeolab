package com.geolab.pojo.clay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 对应PileLoadTestRecords表：黏土记录表
 */
public class PileLoadTestRecords {
    private int ID;//序号
    private String Country;//国家
    private String Site;//地点
    private String PileID;//桩号，数据库中为Pile ID
    private String SoilType;//土层类型，数据库中为Soil Type
    private Integer AverageIp;//平均塑性指数，数据库中为Average Plastic Index (Ip)
    private String SoilProNote;//土层信息备注，数据库中为Soil Properties Note
    private Integer OCR;//超固结比，数据库中为Overconsolidation Ratio (OCR)
    private String InterfaceAngle;//界面摩擦角，数据库中为Pile-soil Interface Friction Angle (°)
    private Double WaterTableDepth;//地下水高，数据库中为Water Table Depth (m)
    private String InstallationMethod;//安装方式，数据库中为Installation method
    private String TypeOfConePeneTest;//CPT类型，数据库中为Type of Cone Penetrometer Testing
    private String TestType;//试验类型
    private String PileType;//桩的开闭口情况
    private String PileShape;//桩的形状
    private String PileMaterial;//桩的材料
    private Double EmbeddedLength;//桩长，数据库中为Embedded Length (m)
    private Double InitialBoredDepth;//初始钻空深度，数据库中为Initial Bored Hole Depth (m)
    private Double OuterDiameter;//外直径，数据库中为Outer Diameter (mm)
    private Double WallThickness;//桩壁厚，数据库中为Wall Thickness (mm)
    private Double SetUpTime;//休止时间，数据库中为Set Up Time (day)
    private Double PileWeight;//桩的重量，数据库中为Pile Weight (kN)

    private Integer Qm;//测量总承载力
    private Integer Qs;//测量侧摩阻力
    private Integer Qb;//测量桩端阻力
    private Double ICP05AQc;//ICP-05A方法算出的承载力，数据库中为ICP-05A Qc
    private Double ICP05ARatio;//ICP-05AQc/Qm，数据库中为ICP-05A Qc/Qm
    private Double ICP05BQc;//ICP-05B方法算出的承载力，数据库中为ICP-05B Qc
    private Double ICP05BRatio;//ICP-05BQc/Qm，数据库中为ICP-05B Qc/Qm
    private Double Almeida96Qc;//Almeida-96方法算出的承载力，数据库中为Almeida-96 Qc
    private Double Almeida96Ratio;//Almeida-96Qc/Qm，数据库中为Almeida-96 Qc/Qm
    private Double LCPCQc;//LCPC方法算出的承载力，数据库中为LCPC Qc
    private Double LCPCRatio;//LCPCQc/Qm，数据库中为LCPC Qc/Qm
    private Double CPT2000Qc;//CPT-2000方法算出的承载力，数据库中为CPT-2000 Qc
    private Double CPT2000Ratio;//CPT-2000Qc/Qm，数据库中为CPT-2000 Qc/Qm
    private Integer UWA13AQc;//UWA-13A方法算出的承载力，数据库中为UWA-13A Qc
    private Double UWA13ARatio;//UWA-13AQc/Qm，数据库中为UWA-13A Qc/Qm
    private Integer UWA13BQc;//UWA-13B方法算出的承载力，数据库中为UWA-13B Qc
    private Double UWA13BRatio;//UWA-13BQc/Qm，数据库中为UWA-13B Qc/Qm
    private Double Fugro96Qc;//Fugro-96方法算出的承载力，数据库中为Fugro-96 Qc
    private Double Fugro96Ratio;//Fugro-96Qc/Qm，数据库中为Fugro-96 Qc/Qm
    private Double NGI99Qc;//NGI-99方法算出的承载力，数据库中为NGI-99 Qc
    private Double NGI99Ratio;//NGI-99Qc/Qm，数据库中为NGI-99 Qc/Qm
    private Integer APIQc;//API方法算出的承载力，数据库中为API Qc
    private Double APIRatio;//APIQc/Qm，数据库中为API Qc/Qm

    private String Reference;//参考文献
    private String DataFrom;//来源，数据库中为Data From
    private String InterfaceAngleNote;//界面摩擦角备注，数据库中为Interface Friction Angle Note
    private String LoadNote;//试验备注，数据库中为Load Note
}
