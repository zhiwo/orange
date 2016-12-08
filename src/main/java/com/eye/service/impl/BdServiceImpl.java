package com.eye.service.impl;

import com.eye.dao.BdDao;
import com.eye.service.BdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by holdlg on 2016/12/8.
 */
@Service
public class BdServiceImpl implements BdService {

    @Autowired
    private BdDao bdDao;

}
