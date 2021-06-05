package com.geolab.service;

import com.geolab.pojo.ResponseResult;
import com.geolab.pojo.clay.PileLoadTestRecords;
import com.geolab.pojo.sand.SandLoadTestRecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResponseResultService {

    ResponseResult<List<SandLoadTestRecords>> selectSandAllRecords();

    ResponseResult<SandLoadTestRecords> selectSandById(int ID);

    ResponseResult<List<SandLoadTestRecords>> selectSandLike(String keyword);

    ResponseResult<Integer> countSandRecords();

    ResponseResult<List<PileLoadTestRecords>> selectClayAllRecords();

    ResponseResult<PileLoadTestRecords> selectClayById(int ID);

    ResponseResult<List<PileLoadTestRecords>> selectClayLike(String keyword);

    ResponseResult<Integer> countClayRecords();
}
