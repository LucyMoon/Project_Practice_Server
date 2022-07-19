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

    public int join(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.join(params);
    }

    public Map<String, Object> login(Map<String, Object> params){
        System.out.println("BaseDataService data : ");
        return baseDataMapper.login(params);
    }

    public int Erpost(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.Erpost(params);
    }

    public int Ercomment(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.Ercomment(params);
    }

    public List<Map<String, Object>> Erviewposts() {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.Erviewposts();
    }

    public Map<String, Object> Erviewpost(int i) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.Erviewpost(i);
    }

    public int Erupdate(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.Erupdate(params);
    }

    public int Erdelete(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.Erdelete(params);
    }
    public List<Map<String, Object>> getmyEr(String id) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.getmyEr(id);
    }

    public int updatemy(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.updatemy(params);
    }

    public List<Map<String, Object>> infoviewposts(String category) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.infoviewposts(category);
    }

    public Map<String, Object> infoviewpost(int i, String category) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.infoviewpost(i, category);
    }

    public int infopost(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.infopost(params);
    }

    public int infodelete(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.infodelete(params);
    }

    public int infoupdate(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.infoupdate(params);
    }

    public int infocomment(Map<String, Object> params){
        System.out.println("BaseDataService data : " + params);
        return baseDataMapper.infocomment(params);
    }

    public List<Map<String, Object>> getmyinfo(String id) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.getmyinfo(id);
    }

    public Map<String, Object> getmy(String id) {

        System.out.println("BaseDataService data : ");
        return baseDataMapper.getmy(id);
    }

}
