
package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by FanShouxing on 2016/6/22.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1,表示更新的记录
     */
    int reduceNumber(long seckillId, Date killTime);


    /**
     *根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);


    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offset,int limit);
}
