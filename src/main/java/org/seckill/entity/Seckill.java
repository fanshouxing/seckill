
package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by FanShouxing on 2016/6/22.
 */
@Data
public class Seckill {

    private long seckillId;

    private String name;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;


}
