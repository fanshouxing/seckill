/*
 * Copyright (c) 2016. 上海趣医网络技术服务有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {
    //注入Dao实现依赖
    @Resource
    private SeckillDao seckillDao;


    @Test
    public void testReduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println("updateCount=" + updateCount);
    }

    @Test
    public void testQueryById() throws Exception {
        long id = 1001;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Seckill> seckills=seckillDao.queryAll(0,100);
        for (Seckill seckill: seckills) {
            System.out.println(seckill);
        }
    }

}