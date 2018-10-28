package com.cn.seckill.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Project: seckill
 * Created by admin on 2018/10/28 16:55
 * 秒杀订单
 */

@Data
public class SuccessKill {

    //秒杀订单ID
    private long secKillID;

    //用户电话
    private long userPhone;

    //订单状态
    private short state;

    //秒杀成功时间
    private Date createTime;

    //多对一
    private SecKill secKill;


}
