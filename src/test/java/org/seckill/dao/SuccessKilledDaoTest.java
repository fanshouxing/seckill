/*
 * Copyright (c) 2016. 上海趣医网络技术服务有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by FanShouxing on 2016/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void testInsertSuccessKilled() throws Exception {
        long id = 1001L;
        long phone = 13165656561L;
        int insertCount = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount="+ insertCount);
    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long phone = 13165656561L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}