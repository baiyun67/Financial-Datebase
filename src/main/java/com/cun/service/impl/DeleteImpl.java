package com.cun.service.impl;

import com.cun.mapper.DeleteMapper;
import com.cun.service.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteImpl  implements Delete {

    @Autowired
    private DeleteMapper deleteMapper;

    @Override
    public Boolean delete(Integer id) {
        return deleteMapper.deleteByPrimaryKey(id)==1;
    }
}
