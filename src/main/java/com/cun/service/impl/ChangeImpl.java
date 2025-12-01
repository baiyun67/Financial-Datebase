package com.cun.service.impl;

import com.cun.mapper.ChangeMapper;
import com.cun.pojo.Financial;
import com.cun.service.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeImpl  implements Change {

    @Autowired
    private ChangeMapper changeMapper;
    @Override
    public boolean change(Financial financial) {
        return changeMapper.UpdateById(financial)==1;
    }

}
