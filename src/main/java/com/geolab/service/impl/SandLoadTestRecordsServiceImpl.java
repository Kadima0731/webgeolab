package com.geolab.service.impl;

import com.geolab.mapper.SandLoadTestRecordsMapper;
import com.geolab.pojo.sand.SandLoadTestRecords;
import com.geolab.service.SandLoadTestRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandLoadTestRecordsServiceImpl implements SandLoadTestRecordsService {

    @Autowired
    private SandLoadTestRecordsMapper sandLoadTestRecordsMapper;

    @Override
    public List<SandLoadTestRecords> selectSandAllRecords() {
        return sandLoadTestRecordsMapper.selectSandAllRecords();
    }

    @Override
    public SandLoadTestRecords selectSandById(int ID) {
        return sandLoadTestRecordsMapper.selectSandById(ID);
    }

    @Override
    public List<SandLoadTestRecords> selectSandLike(String keyword) {
        return sandLoadTestRecordsMapper.selectSandLike(keyword);
    }

    @Override
    public int countSandRecords() {
        return sandLoadTestRecordsMapper.countSandRecords();
    }
}
