package com.cun.mapper;

import com.cun.pojo.Financial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SearchMapper {

    @Select("select * from information ")
    List<Financial> FindAll();

    List<Financial> FindByCondition(Financial financial);

}
