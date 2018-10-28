package com.cn.seckill.dao;

import com.cn.seckill.pojo.SuccessKill;

/**
 * Project: seckill
 * Created by admin on 2018/10/28 17:07
 */
public interface SuccessKillDao {

    /**
     * 插入秒杀订单，过滤重复
     * @param secKillId
     * @param userPhone
     * @return
     */
    int insertSuccessKill(long secKillId, long userPhone);

    /**
     * 根据id查询秒杀订单并携带秒杀产品实体
     * @param secKillId
     * @return
     */
    SuccessKill queryByIdWithSecKill(long secKillId);
}
