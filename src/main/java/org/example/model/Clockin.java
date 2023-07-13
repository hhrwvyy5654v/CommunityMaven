package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Clockin
 * @Datetime: 2023/05/28 00:01
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Clockin实体类的定义，对应数据库中的一张Clockin表
 */

@Data   //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false)   //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true)    //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Clockin对象", description = "")   //定义了一个名为"Clockin对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Clockin implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 指定了id字段为主键，字段类型为Integer，主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; //主键ID，自增类型
    // 指定了clockInTime属性的日期格式化方式为"yyyy-MM-dd"，表示将该属性转为以"年-月-日"的格式显示。
    // 同时，locale属性为"zh"，表示本地化信息为中文，timezone属性为"GMT+8"，表示时区为北京时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date clockInTime;   //打卡时间，日期类型
    private Integer ownerId; //所有者ID，整型
    private Integer houseId; //房屋ID，整型
    private Integer buildingId; //楼房ID，整型
    private Owner owner;    // 所有者对象，Owner类型
    private House house;    // 房屋对象，House类型
    private Building building;  // 楼房对象，Building类型

}

