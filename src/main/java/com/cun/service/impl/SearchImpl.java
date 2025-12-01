package com.cun.service.impl;

import com.cun.mapper.SearchMapper;
import com.cun.pojo.Financial;
import com.cun.service.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchImpl implements Search {
    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List<Financial> getAllFinancialList() {
        return searchMapper.FindAll();
    }

    @Override
    public List<Financial> getFinancialList(Financial financial) {
       return searchMapper.FindByCondition(financial);
    }
}
