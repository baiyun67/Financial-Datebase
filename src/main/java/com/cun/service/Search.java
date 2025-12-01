package com.cun.service;

import com.cun.pojo.Financial;

import java.util.List;

public interface Search {
    List<Financial> getAllFinancialList();
    List<Financial> getFinancialList(Financial financial);
}
