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
 * @ClassName: Owner
 * @Datetime: 2023/05/28 01:23
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Owner对象", description = "") //定义了一个名为"Owner对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Owner implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 业主的信息的ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String username;    // 业主的姓名，类型为String
    private String tel;         // 业主的联系电话，类型为String
    private String sex;         // 业主的性别，类型为String
    private String identity;    // 业主的身份证号码，类型为String
    private Integer houseId;    // 业主所居住的房屋ID，类型为Integer
    private String remarks;     // 业主备注信息，类型为String
    private String password;    // 业主登录系统时使用的密码，类型为String
    private House house;        // 业主所居住的房屋信息，类型为House

}

