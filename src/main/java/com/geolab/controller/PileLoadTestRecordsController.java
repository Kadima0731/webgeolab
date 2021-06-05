package com.geolab.controller;

import com.geolab.pojo.ResponseResult;
import com.geolab.pojo.clay.PileLoadTestRecords;
import com.geolab.pojo.sand.SandLoadTestRecords;
import com.geolab.service.ResponseResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/clay")
public class PileLoadTestRecordsController {

    @Autowired
    private ResponseResultService resultService;

    @RequestMapping(value = "/AllRecords", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<PileLoadTestRecords>> selectClayAllRecords() {
        ResponseResult<List<PileLoadTestRecords>> result = resultService.selectClayAllRecords();
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsByID/{ID}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<PileLoadTestRecords> selectClayById(@PathVariable("ID") Integer ID){
        ResponseResult<PileLoadTestRecords> result = resultService.selectClayById(ID);
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsLike/{keyword}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<PileLoadTestRecords>> selectClayLike(@PathVariable("keyword") String keyword){
        ResponseResult<List<PileLoadTestRecords>> result = resultService.selectClayLike(keyword);
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsCount", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<Integer> countClayRecords(){
        ResponseResult<Integer> result = resultService.countClayRecords();
        return result;
    }
}
