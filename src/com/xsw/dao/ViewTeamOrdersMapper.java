package com.xsw.dao;

import com.xsw.model.ViewTeamOrders;

public interface ViewTeamOrdersMapper {
    int insert(ViewTeamOrders record);

    int insertSelective(ViewTeamOrders record);
}