package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: PropertyType
 * @Datetime: 2023/05/28 17:23
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: PropertyType实体类的定义，对应数据库中的一张表
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "PropertyType对象", description = "") //定义了一个名为"Parking对象"的类，用于描述一个打卡记录对象,没有详细的描述信息
@TableName("property_type") // Mybatis-Plus注解，用于指定对应的数据库表名

public class PropertyType implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 物业费用类型ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;    //物业费用类型名称，类型为String
    private Double price;   //物业费用单价，类型为Double
    private String unit;    //物业费用计量单位，类型为String
    private String remarks; //物业费用类型备注信息，类型为String
}

