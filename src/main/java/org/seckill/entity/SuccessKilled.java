
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
