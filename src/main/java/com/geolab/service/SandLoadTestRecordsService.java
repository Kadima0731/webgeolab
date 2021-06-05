package com.geolab.service;

import com.geolab.pojo.clay.PileLoadTestRecords;
import com.geolab.pojo.sand.SandLoadTestRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SandLoadTestRecordsService {
    List<SandLoadTestRecords> selectSandAllRecords();

    SandLoadTestRecords selectSandById(int ID);

    List<SandLoadTestRecords> selectSandLike(String keyword);

    int countSandRecords();
}
