package com.cun.mapper;

import com.cun.pojo.Financial;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChangeMapper {

    Integer UpdateById(Financial financial);

}
