package com.eye.service.impl;

import com.eye.dao.TtblDao;
import com.eye.service.TtblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by holdlg on 2016/12/8.
 */
@Service
public class TtblServiceImpl implements TtblService {

    @Autowired
    private TtblDao ttblDao;

}
