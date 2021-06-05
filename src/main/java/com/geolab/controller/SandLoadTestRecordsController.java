package com.geolab.controller;

import com.geolab.pojo.ResponseResult;
import com.geolab.pojo.sand.SandLoadTestRecords;
import com.geolab.service.ResponseResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/sand")
public class SandLoadTestRecordsController {

    @Autowired
    private ResponseResultService resultService;

    @RequestMapping(value = "/AllRecords", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<SandLoadTestRecords>> selectSandAllRecords() {
        ResponseResult<List<SandLoadTestRecords>> result = resultService.selectSandAllRecords();
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsByID/{ID}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<SandLoadTestRecords> selectSandById(@PathVariable("ID") Integer ID){
        ResponseResult<SandLoadTestRecords> result = resultService.selectSandById(ID);
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsLike/{keyword}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<SandLoadTestRecords>> selectSandLike(@PathVariable("keyword") String keyword){
        ResponseResult<List<SandLoadTestRecords>> result = resultService.selectSandLike(keyword);
        if (!result.isSuccess()) {
            System.out.println("查询失败");
        }
        return result;
    }

    @RequestMapping(value = "/RecordsCount", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<Integer> countSandRecords(){
        ResponseResult<Integer> result = resultService.countSandRecords();
        return result;
    }
}
