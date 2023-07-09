package org.example.model;

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
 * @ClassName: Userinfo
 * @Datetime: 2023/05/28 19:41
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Userinfo实体类的定义，对应数据库中的一张表
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Userinfo对象", description = "") //定义了一个名为"Userinfo对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Userinfo implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 用户ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String username;    //用户名称，类型为String，用于表示该用户的名称
    private String password;    //用户密码，类型为String，用于表示该用户的密码
    private Integer type;       //用户类型，类型为Integer，用于表示该用户的类型，例如管理员、普通用户等类型
    private String remarks;     //用户的备注信息，类型为String，用于记录该用户的一些备注信息
}

