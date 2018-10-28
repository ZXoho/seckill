package com.cn.seckill.dao;

import com.cn.seckill.pojo.SecKill;

import javax.swing.*;
import java.util.Date;
import java.util.List;

/**
 * Project: seckill
 * Created by admin on 2018/10/28 17:01
 */
public interface SecKillDao {

    /**
     * 减库存
     * @param secKillId
     * @param killTime
     * @return
     */
    int reduceNumber(long secKillId, Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param secKillId
     * @return
     */
    SecKill queryById(long secKillId);

    /**
     * 根据偏移量查询秒杀列表
     * @param offset
     * @param limit
     * @return
     */
    List<SecKill> quertAll(int offset, int limit);
}
