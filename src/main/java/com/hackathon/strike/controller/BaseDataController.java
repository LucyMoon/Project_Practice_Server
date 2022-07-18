package com.hackathon.strike.controller;
import com.hackathon.strike.service.BaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BaseDataController {

    @Autowired
    BaseDataService baseDataService;

    @RequestMapping("/inputData")
    public @ResponseBody Map<String, Object> inputData(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.baseDataInput(params);
        Map<String, Object> responseData = new HashMap<>();

        return params;

    }

    @RequestMapping("/selectAll")
    public @ResponseBody List<Map<String, Object>> selectAll(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController selectAll : ");

        List<Map<String, Object>> responseData = baseDataService.selectAllData(params);

        return responseData;

    }

    @RequestMapping("/join")
    public @ResponseBody Map<String, Object> join(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.join(params);

        return params;

    }

    @RequestMapping("/login")
    public @ResponseBody Map<String, Object> login(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController login : ");

        Map<String, Object> responseData = baseDataService.login(params);

        return responseData;

    }

    @RequestMapping("/post")
    public @ResponseBody Map<String, Object> post(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.post(params);

        return params;

    }

    @RequestMapping("/comment")
    public @ResponseBody Map<String, Object> comment(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.comment(params);

        return params;

    }

}
