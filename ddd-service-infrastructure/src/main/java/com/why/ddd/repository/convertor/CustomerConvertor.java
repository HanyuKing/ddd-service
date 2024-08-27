package com.why.ddd.repository.convertor;

import com.why.ddd.database.dataobject.CustomerDO;
import com.why.ddd.domain.customer.entity.Customer;

/**
 * @Author Hanyu.Wang
 * @Date 2024/8/27 14:38
 * @Description
 * @Version 1.0
 **/
public class CustomerConvertor {
    public static CustomerDO entityToDO(Customer customer) {
        CustomerDO customerDO = new CustomerDO();
        customerDO.setCustomerId(customer.getCustomerId());
        customerDO.setGlobalId(customer.getGlobalId());
        customerDO.setCompanyName(customer.getCompanyName());
        customerDO.setMemberId(customer.getMemberId());
        customerDO.setRegisteredCapital(customer.getRegisteredCapital());
        return customerDO;
    }

    public static Customer doToEntity(CustomerDO customerDO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerDO.getCustomerId());
        customer.setGlobalId(customerDO.getGlobalId());
        customer.setCompanyName(customerDO.getCompanyName());
        customer.setMemberId(customerDO.getMemberId());
        customer.setRegisteredCapital(customerDO.getRegisteredCapital());
        return customer;
    }
}
