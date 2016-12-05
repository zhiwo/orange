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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by holdlg on 2016/11/22.
 */
@Controller
public class BSController {


    @Autowired
    private BSService bsService;

    @RequestMapping(value = "/bs/list", method = RequestMethod.GET)
    public String toBsListPage(Model mode) {
//        list=bsService.getBSList();
        List<BS> list = new ArrayList<BS>();
        for (int i = 0; i < 10; i++) {
            BS bs = new BS();
            bs.bsId = "0001";
            bs.bsAddress = "北京裁定";
            bs.bsName ="不上班";
            bs.bsPingYin = "wcwc";
            bs.bsLatitude = "N498394'232";
            bs.bsLongitude = "S2323'113";
            bs.bsStatus = "1";
            bs.id = i;

            list.add(bs);
        }

        mode.addAttribute("list",list);

        return "bs/list";
    }

}
