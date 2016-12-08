package com.eye.service.impl;

import com.eye.dao.LsDao;
import com.eye.service.LsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by holdlg on 2016/12/8.
 */
@Service
public class LsServiceImpl implements LsService {

    @Autowired
    private LsDao lsDao;
}
