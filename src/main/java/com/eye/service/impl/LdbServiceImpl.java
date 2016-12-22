package com.eye.service.impl;

import com.eye.dao.LdbDao;
import com.eye.service.LdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by holdlg on 2016/12/8.
 */
@Service
public class LdbServiceImpl implements LdbService {

    @Autowired
    private LdbDao ldbDao;

}
