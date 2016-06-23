
package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by FanShouxing on 2016/6/22.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     * 插入的行数
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SunccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);


}
