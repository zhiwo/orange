package com.eye.service.impl;

import com.eye.dao.DptDao;
import com.eye.service.DptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by holdlg on 2016/12/8.
 */
@Service
public class DptServiceImpl implements DptService {

    @Autowired
    private DptDao dptDao;
}
