package com.geolab.mapper;

import com.geolab.pojo.clay.PileLoadTestRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PileLoadTestRecordsMapper {

    List<PileLoadTestRecords> selectClayAllRecords();

    PileLoadTestRecords selectClayById(@Param("ID") int ID);

    List<PileLoadTestRecords> selectClayLike(@Param("keyword") String keyword);

    int countClayRecords();
}
