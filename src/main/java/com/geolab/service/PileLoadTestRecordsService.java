package com.geolab.service;

import com.geolab.pojo.clay.PileLoadTestRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PileLoadTestRecordsService {

    List<PileLoadTestRecords> selectClayAllRecords();

    PileLoadTestRecords selectClayById(int ID);

    List<PileLoadTestRecords> selectClayLike(String keyword);

    int countClayRecords();
}
