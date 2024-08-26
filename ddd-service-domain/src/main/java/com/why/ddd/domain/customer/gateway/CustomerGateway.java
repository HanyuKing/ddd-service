package com.why.ddd.domain.customer.gateway;

import com.why.ddd.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
