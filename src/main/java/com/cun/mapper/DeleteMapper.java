package com.cun.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeleteMapper {
    @Delete("")
    public int deleteByPrimaryKey(Integer id);
}
