package com.xsw.dao;

import com.xsw.model.TeamsDTO;
import com.xsw.model.TeamsDTOWithBLOBs;

public interface TeamsDTOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TeamsDTOWithBLOBs record);

    int insertSelective(TeamsDTOWithBLOBs record);

    TeamsDTOWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeamsDTOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TeamsDTOWithBLOBs record);

    int updateByPrimaryKey(TeamsDTO record);
}