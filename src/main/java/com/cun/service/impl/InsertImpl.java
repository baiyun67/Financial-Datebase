package com.cun.service.impl;

import com.cun.mapper.InsertMapper;
import com.cun.pojo.Financial;
import com.cun.service.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertImpl implements Insert {
    @Autowired
    private InsertMapper insertMapper;
    @Override
    public boolean insert(Financial financial) {
        return insertMapper.insert(financial)==1;
    }
}
