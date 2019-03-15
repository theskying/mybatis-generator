package com.test.dao;

import com.test.pojo.SkyUserActionOnlineStat;

public interface SkyUserActionOnlineStatMapper {
    int deleteByPrimaryKey(String statId);

    int insert(SkyUserActionOnlineStat record);

    int insertSelective(SkyUserActionOnlineStat record);

    SkyUserActionOnlineStat selectByPrimaryKey(String statId);

    int updateByPrimaryKeySelective(SkyUserActionOnlineStat record);

    int updateByPrimaryKey(SkyUserActionOnlineStat record);
}