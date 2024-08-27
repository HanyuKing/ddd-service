package com.why.ddd.domain.customer.gateway;

import com.why.ddd.domain.customer.entity.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);

    void save(Customer customer);
}
