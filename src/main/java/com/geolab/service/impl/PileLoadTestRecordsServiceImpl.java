package com.geolab.service.impl;

import com.geolab.mapper.PileLoadTestRecordsMapper;
import com.geolab.pojo.clay.PileLoadTestRecords;
import com.geolab.service.PileLoadTestRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PileLoadTestRecordsServiceImpl implements PileLoadTestRecordsService {

    @Autowired
    private PileLoadTestRecordsMapper pileLoadTestRecordsMapper;


    @Override
    public List<PileLoadTestRecords> selectClayAllRecords() {
        return pileLoadTestRecordsMapper.selectClayAllRecords();
    }

    @Override
    public PileLoadTestRecords selectClayById(int ID) {
        return pileLoadTestRecordsMapper.selectClayById(ID);
    }

    @Override
    public List<PileLoadTestRecords> selectClayLike(String keyword) {
        return pileLoadTestRecordsMapper.selectClayLike(keyword);
    }

    @Override
    public int countClayRecords() {
        return pileLoadTestRecordsMapper.countClayRecords();
    }
}
