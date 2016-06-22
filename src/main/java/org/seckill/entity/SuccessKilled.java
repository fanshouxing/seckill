/*
 * Copyright (c) 2016. 上海趣医网络技术服务有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by FanShouxing on 2016/6/22.
 */
@Data
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;

    //变通
    //多对一
    private Seckill seckill;


}
