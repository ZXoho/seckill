package com.cn.seckill.dao;

import com.cn.seckill.pojo.SecKill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Project: seckill
 * Created by admin on 2018/10/29 12:49
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecKillDaoTest {

    @Resource
    private SecKillDao secKillDao;

    @Test
    public void reduceNumber() {

    }

    @Test
    public void queryById() throws Exception{
        SecKill secKill = secKillDao.queryById(1001);
        System.out.println(secKill);
    }

    @Test
    public void queryAll() {
    }
}