package com.hackathon.strike.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Mapper
public interface BaseDataMapper {

    int baseDataInput(Map<String, Object> params);
    List<Map<String, Object>> selectAllData(Map<String, Object> params);
    int join(Map<String, Object> params);
    Map<String, Object> login(Map<String, Object> params);
    int post(Map<String, Object> params);
    int comment(Map<String, Object> params);




}