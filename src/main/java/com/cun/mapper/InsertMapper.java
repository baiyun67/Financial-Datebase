package com.cun.mapper;

import com.cun.pojo.Financial;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMapper {
    @Insert("INSERT INTO information (date, finance_type, amount, deal_name, remark) VALUES " +
            "(#{date}, #{financeType}, #{amount}, #{dealName}, #{remark})")
    Integer insert(Financial financial);
}

