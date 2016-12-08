package com.eye.controller;

import com.eye.service.LdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by holdlg on 2016/12/8.
 */
@Controller
@RequestMapping(value = "/ldb")
public class LdbController {

    @Autowired
    private LdbService ldbService;
}
