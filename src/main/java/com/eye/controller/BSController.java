package com.eye.controller;


import com.eye.entity.BS;
import com.eye.service.BSService;
import com.eye.service.impl.BSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by holdlg on 2016/11/22.
 */
@Controller

public class BSController {

//    @Autowired
//    private BSService bsService;
//
//    @RequestMapping("/list")
//    public Map getBSList(){
//        Map map=new HashMap();
//        map.put("info",bsService.getBSList());
//        return map;
//    }

    @Autowired
    private BSService bsService;

    @RequestMapping(value = "/index222", method = RequestMethod.GET)
    public String doBSPage(List<BS> list, Model mode) {
        list=bsService.getBSList();
        mode.addAttribute("list",list);

        return "";
    }

}
