package com.why.ddd.database;

import com.why.ddd.database.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

  CustomerDO getById(String customerId);

  void save(CustomerDO customerDO);
}
