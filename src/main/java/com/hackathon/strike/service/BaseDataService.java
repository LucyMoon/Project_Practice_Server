package com.hackathon.strike.service;

import com.hackathon.strike.mapper.BaseDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BaseDataService {

    @Autowired
    BaseDataMapper baseDataMapper;

    public int baseDataInput(Map<String, Object> params){
        System.out.println("BaseDataService data : "+params);
        return baseDataMapper.baseDataInput( params);
    }

    public List<Map<String, Object>> selectAllData(Map<String, Object> params){
        System.out.println("BaseDataService data : ");
        return baseDataMapper.selectAllData(params );
    }

    public int join(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.join(params);
    }

    public Map<String, Object> login(Map<String, Object> params){
        System.out.println("BaseDataService data : ");
        return baseDataMapper.login(params);
    }

    public int post(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.post(params);
    }

    public int comment(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.comment(params);
    }

}
