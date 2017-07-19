package com;

import com.bl.DataCurrencyBL;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by Artem on 03.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test extends AbstractTestNGSpringContextTests {

    @Autowired
    DataCurrencyBL dataCurrencyBL;

    @org.testng.annotations.Test
    public void test(){
        dataCurrencyBL.getCurrencySB();
    }
}
