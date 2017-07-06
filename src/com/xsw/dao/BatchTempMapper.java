package com.xsw.dao;

import com.xsw.model.BatchTemp;

public interface BatchTempMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BatchTemp record);

    int insertSelective(BatchTemp record);

    BatchTemp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BatchTemp record);

    int updateByPrimaryKey(BatchTemp record);
}