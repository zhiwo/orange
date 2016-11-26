package com.eye.service.impl;

import com.eye.dao.BSDao;
import com.eye.entity.BS;
import com.eye.service.BSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BSServiceImpl
 * description: com.eye.service.impl.BSServiceImpl
 * author: holdlg
 * date: 2016/11/20
 * copyright: fengyan
 */
@Service
public class BSServiceImpl implements BSService {

    @Autowired
    BSDao bsDao;

    @Override
    public List<BS> getBSList() {
        return bsDao.findAllBSList();
    }
}
