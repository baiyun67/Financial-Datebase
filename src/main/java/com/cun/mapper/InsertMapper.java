package com.cun.mapper;

import com.cun.pojo.Financial;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMapper {
    @Insert("insert into")
    Integer insert(Financial financial);
}
