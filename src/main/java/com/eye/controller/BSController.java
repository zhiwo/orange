package com.eye.controller;

import com.eye.dao.BSDao;
import com.eye.entity.BS;
import com.eye.service.BSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by holdlg on 2016/11/22.
 */
@RestController
@RequestMapping("/bs")
public class BSController {

    @Autowired
    private BSService bsService;

    @RequestMapping("/list")
    public Map getBSList(){
        Map map=new HashMap();
        map.put("info",bsService.getBSList());
        return map;
    }
}
