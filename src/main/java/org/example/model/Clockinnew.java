package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Clockinnew
 * @Datetime: 2023/05/28 00:38
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为Clockinnew的JavaBean类，用于表示打卡记录
 */
@Data   //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false)   //自动生成equals和hashCode方法，简化代码编写
@Accessors(chain = true) // 使用链式调用的形式，即可以通过类似obj.setId(1).setReportDate(new Date())的方式设置属性值
@ApiModel(value = "Clockinnew对象", description = "") // 用于接口文档生成和测试的数据模型

public class Clockinnew implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 使用Mybatis-Plus中的@TableId注解，用于指定表的主键字段，value表示字段名，type表示主键类型，这里是自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 主键ID，自增类型
    // 指定了clockInTime属性的日期格式化方式为"yyyy-MM-dd"，表示将该属性转为以"年-月-日"的格式显示。
    // 同时，locale属性为"zh"，表示本地化信息为中文，timezone属性为"GMT+8"，表示时区为北京时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date reportDate;    // 打卡日期，使用Date类型存储
    private Integer owerId;     // 打卡记录对应的所有者ID，使用Integer类型存储
    @ApiModelProperty(value = "是否为疑似病例如咳嗽,发热(0或1)")
    private Integer type1;      // 表示是否为疑似病例，如咳嗽、发热等，使用Integer类型存储，取值为0或1，其中0表示否，1表示是
    @ApiModelProperty(value = "是否确诊为肺炎病例")
    private Integer type2;      // 表示是否确诊为肺炎病例，使用Integer类型存储，取值为0或1，其中0表示否，1表示是
    private String todayAddress;    // 打卡时所在的地址，使用String类型存储
    private String remarks;     // 打卡记录的备注信息，使用String类型存储
    private Owner owner;    // 打卡记录对应的所有者信息
}

