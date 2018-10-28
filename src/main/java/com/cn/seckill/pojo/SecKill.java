package com.cn.seckill.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Project: seckill
 * Created by ZXoho on 2018/10/28 16:43
 */

@Data
public class SecKill {

    //秒杀编号
    private long secKillId;

    //秒杀名字
    private String name;

    //秒杀数量
    private int number;

    //秒杀开始时间
    private Date startTime;

    //秒杀结束时间
    private Date endTime;

    //秒杀创建时间
    private Date createTime;

}
