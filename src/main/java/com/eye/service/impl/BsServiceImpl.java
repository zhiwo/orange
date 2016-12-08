package com.eye.service.impl;

import com.eye.dao.BsDao;
import com.eye.entity.BS;
import com.eye.service.BsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BsServiceImpl
 * description: com.eye.service.impl.BsServiceImpl
 * author: holdlg
 * date: 2016/11/20
 * copyright: fengyan
 */
@Service
public class BsServiceImpl implements BsService {

    @Autowired
    BsDao bsDao;

    @Override
    public List<BS> getBSList() {
        return bsDao.findAllBSList();
    }
}
