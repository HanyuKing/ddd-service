package com.why.ddd.infra;

import com.alibaba.fastjson.JSON;
import com.why.ddd.Application;
import com.why.ddd.database.CustomerMapper;
import com.why.ddd.database.dataobject.CustomerDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testFindByID() {
        CustomerDO customerDO = customerMapper.getById("Test123");

        Assert.assertTrue(customerDO != null && "Test123".equals(customerDO.getCustomerId()));

        System.out.println("testFindByID Response: " + JSON.toJSONString(customerDO));
    }
}
