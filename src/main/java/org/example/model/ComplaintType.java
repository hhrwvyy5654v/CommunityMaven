package org.example.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: ComplaintType
 * @Datetime: 2023/05/28 02:07
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: ComplaintType实体类的定义，对应数据库中的一张表
 */
@Data   //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true)  //自定义链式调用的参数,返回当前对象
@TableName("complaint_type")    //使用了@TableName注解，用于指定Java类对应的数据库表名为"complaint_type"
@ApiModel(value="ComplaintType对象", description="") //定义了一个名为"ComplaintType对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class ComplaintType implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID=1L;
    // 指定了id字段为主键，字段类型为Integer，主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;     // 投诉类型的唯一标识，类型为Integer，并且被指定为主键，主键类型为自增类型
    private String name;    // 投诉类型的名称，类型为String
    private Integer status; // 投诉类型的状态，类型为Integer,用于表示投诉类型的启用状态，一般使用0表示禁用，1表示启用
}

