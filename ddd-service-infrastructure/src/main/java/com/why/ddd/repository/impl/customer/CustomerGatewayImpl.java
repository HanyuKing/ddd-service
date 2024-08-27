package com.why.ddd.repository.impl.customer;

import com.why.ddd.database.CustomerMapper;
import com.why.ddd.database.dataobject.CustomerDO;
import com.why.ddd.domain.customer.entity.Customer;
import com.why.ddd.domain.customer.gateway.CustomerGateway;

import com.why.ddd.repository.convertor.CustomerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);

      // Convert to Customer
      return CustomerConvertor.doToEntity(customerDO);
    }

    @Override
    public void save(Customer customer) {
        customerMapper.save(CustomerConvertor.entityToDO(customer));
    }
}
