package com.hackathon.strike.controller;
import com.hackathon.strike.service.BaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BaseDataController {

    @Autowired
    BaseDataService baseDataService;

    @RequestMapping("/join")
    public @ResponseBody Map<String, Object> join(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.join(params);

        return params;

    }

    @RequestMapping("/login")
    public @ResponseBody Map<String, Object> login(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController login : " + params);

        Map<String, Object> responseData = baseDataService.login(params);
        if(responseData != null){
            return responseData;
        }
        return null;

    }

    @RequestMapping("/Erpost")
    public @ResponseBody Map<String, Object> Erpost(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.Erpost(params);

        return params;

    }

    @RequestMapping("/Ercomment")
    public @ResponseBody Map<String, Object> Ercomment(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.Ercomment(params);

        return params;

    }

    @GetMapping("/Erviewposts")
    public @ResponseBody List<Map<String, Object>> Erviewposts() throws Exception{
        System.out.println("BaseDataController data : ");
        List<Map<String, Object>> responseData = baseDataService.Erviewposts();

        return responseData;

    }

    @GetMapping("/Erviewpost")
    public @ResponseBody Map<String, Object> Erviewpost(@RequestParam(value="index")int index) throws Exception{
        System.out.println("BaseDataController data : ");

        Map<String, Object> responseData = baseDataService.Erviewpost(index);

        return responseData;

    }

    @RequestMapping("/Erupdate")
    public @ResponseBody Map<String, Object> Erupdate(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.Erupdate(params);

        return params;

    }

    @RequestMapping("/Erdelete")
    public @ResponseBody Map<String, Object> Erdelete(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.Erdelete(params);

        return params;

    }

    @GetMapping("/getmyEr")
    public @ResponseBody List<Map<String, Object>> getmyEr(@RequestParam(value="id")String id) throws Exception{
        System.out.println("BaseDataController data : ");

        List<Map<String, Object>> responseData = baseDataService.getmyEr(id);

        return responseData;

    }

    @RequestMapping("/updatemy")
    public @ResponseBody Map<String, Object> updatemy(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.updatemy(params);

        return params;

    }

    @GetMapping("/infoviewposts")
    public @ResponseBody List<Map<String, Object>> infoviewposts() throws Exception{
        System.out.println("BaseDataController data : ");
        List<Map<String, Object>> responseData = baseDataService.infoviewposts();

        return responseData;

    }

    @GetMapping("/infoviewpost")
    public @ResponseBody Map<String, Object> infoviewpost(@RequestParam(value="index")int index) throws Exception{
        System.out.println("BaseDataController data : ");

        Map<String, Object> responseData = baseDataService.infoviewpost(index);

        return responseData;

    }

    @RequestMapping("/infopost")
    public @ResponseBody Map<String, Object> infopost(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.infopost(params);

        return params;

    }

    @RequestMapping("/infodelete")
    public @ResponseBody Map<String, Object> infodelete(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.infodelete(params);

        return params;

    }

    @RequestMapping("/infoupdate")
    public @ResponseBody Map<String, Object> infoupdate(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.infoupdate(params);

        return params;

    }

    @RequestMapping("/infocomment")
    public @ResponseBody Map<String, Object> infocomment(@RequestBody Map<String, Object> params) throws Exception{
        System.out.println("BaseDataController data : "+params);
        baseDataService.infocomment(params);

        return params;

    }

    @GetMapping("/getmyinfo")
    public @ResponseBody List<Map<String, Object>> getmyinfo(@RequestParam(value="id")String id) throws Exception{
        System.out.println("BaseDataController data : ");

        List<Map<String, Object>> responseData = baseDataService.getmyinfo(id);

        return responseData;

    }

    @GetMapping("/getmy")
    public @ResponseBody Map<String, Object> getmy(@RequestParam(value="id")String id) throws Exception{
        System.out.println("BaseDataController data : ");

        Map<String, Object> responseData = baseDataService.getmy(id);

        return responseData;

    }


}
