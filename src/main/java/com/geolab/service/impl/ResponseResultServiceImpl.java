package com.geolab.service.impl;

import com.geolab.pojo.ResponseResult;
import com.geolab.pojo.clay.PileLoadTestRecords;
import com.geolab.pojo.sand.SandLoadTestRecords;
import com.geolab.service.PileLoadTestRecordsService;
import com.geolab.service.ResponseResultService;
import com.geolab.service.SandLoadTestRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseResultServiceImpl implements ResponseResultService {

    @Autowired
    private SandLoadTestRecordsService sandLoadTestRecordsService;
    @Autowired
    private PileLoadTestRecordsService pileLoadTestRecordsService;

    @Override
    public ResponseResult<List<SandLoadTestRecords>> selectSandAllRecords() {
        ResponseResult<List<SandLoadTestRecords>> result = null;
        List<SandLoadTestRecords> data = sandLoadTestRecordsService.selectSandAllRecords();
        if (data.size() > 0){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<SandLoadTestRecords> selectSandById(int ID) {
        ResponseResult<SandLoadTestRecords> result = null;
        SandLoadTestRecords data = sandLoadTestRecordsService.selectSandById(ID);
        if (data != null){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<List<SandLoadTestRecords>> selectSandLike(String keyword) {
        ResponseResult<List<SandLoadTestRecords>> result = null;
        List<SandLoadTestRecords> data = sandLoadTestRecordsService.selectSandLike(keyword);
        if (data.size() > 0){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<Integer> countSandRecords() {
        int data = sandLoadTestRecordsService.countSandRecords();
        return new ResponseResult<>(true,"查询成功",data);
    }

    @Override
    public ResponseResult<List<PileLoadTestRecords>> selectClayAllRecords() {
        ResponseResult<List<PileLoadTestRecords>> result = null;
        List<PileLoadTestRecords> data = pileLoadTestRecordsService.selectClayAllRecords();
        if (data.size() > 0){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<PileLoadTestRecords> selectClayById(int ID) {
        ResponseResult<PileLoadTestRecords> result = null;
        PileLoadTestRecords data = pileLoadTestRecordsService.selectClayById(ID);
        if (data != null){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<List<PileLoadTestRecords>> selectClayLike(String keyword) {
        ResponseResult<List<PileLoadTestRecords>> result = null;
        List<PileLoadTestRecords> data = pileLoadTestRecordsService.selectClayLike(keyword);
        if (data.size() > 0){
            result = new ResponseResult<>(true,"查询成功",data);
        }else {
            result = new ResponseResult<>(false,"查询失败",data);
        }
        return result;
    }

    @Override
    public ResponseResult<Integer> countClayRecords() {
        int data = pileLoadTestRecordsService.countClayRecords();
        return new ResponseResult<>(true,"查询成功",data);
    }
}
