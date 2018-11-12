package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * @author leikai
 * @Date 2018/11/12 11:15 PM
 * @Description: TODO
 **/
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckikkId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckikkId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
