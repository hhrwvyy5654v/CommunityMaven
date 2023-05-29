package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Parking
 * @Datetime: 2023/05/28 01:27
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true)  //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Parking对象", description = "")  //定义了一个名为"Parking对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Parking implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 停车记录信息的ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String numbers;     //停车记录对应的房屋编号，类型为String
    private Integer status;     //停车记录的状态，类型为Integer，用于表示停车记录的状态，一般使用0表示未支付，1表示已支付
    private Integer ownerId;    //停车记录对应的业主ID，类型为Integer
    private String remarks;     //停车记录备注信息，类型为String
    private Owner owner;        //停车记录对应的业主信息，类型为Owner
}

