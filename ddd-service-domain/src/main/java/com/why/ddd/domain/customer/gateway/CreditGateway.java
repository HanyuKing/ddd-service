package com.why.ddd.domain.customer.gateway;

import com.why.ddd.domain.customer.entity.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
