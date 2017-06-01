package com.asozero;

import com.asozero.dao.AdminMapper;
import com.asozero.model.Admin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest{

    @Resource
    private AdminMapper adminMapper;

    Logger logger = LogManager.getLogger(BaseTest.class.getName());

    @Test
    public void test(){
//        PageHelper.startPage(1, 10);
        Admin a= adminMapper.selectByPrimaryKey(1L);
//        PageInfo page = new PageInfo(adminUserList);
        logger.fatal( "fatal object is:"+a);
    }

}