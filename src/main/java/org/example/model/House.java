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
 * @ClassName: House
 * @Datetime: 2023/05/28 01:32
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "House对象", description = "") //定义了一个名为"House对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class House implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 房屋信息的ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer storey; //房屋所在楼层，类型为Integer
    private String numbers; //房屋编号，类型为String
    private Integer status; //房屋状态，类型为Integer,用于表示房屋的出租状态，一般使用0表示未出租，1表示已出租。
    // 房屋入住日期，类型为Date，使用了@JsonFormat注解指定了日期格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date intoDate;
    private Integer buildingId; //房屋所在建筑物的ID，类型为Integer
    private String remarks; //房屋备注信息，类型为String
    private Double area;    // 房屋面积，类型为Double
}

