package com.geolab.mapper;

import com.geolab.pojo.sand.SandLoadTestRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SandLoadTestRecordsMapper {

    List<SandLoadTestRecords> selectSandAllRecords();

    SandLoadTestRecords selectSandById(@Param("ID") int ID);

    List<SandLoadTestRecords> selectSandLike(@Param("keyword") String keyword);

    int countSandRecords();

}
