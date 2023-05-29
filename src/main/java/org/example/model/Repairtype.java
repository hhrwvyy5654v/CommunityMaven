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
 * @ClassName: Repairtype
 * @Datetime: 2023/05/28 19:41
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Repairtype对象", description = "") //定义了一个名为"Repairtype对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Repairtype implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 打卡记录ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;    //打卡类型名称，类型为String，用于表示该打卡类型的名称
    private String remarks; //打卡类型的备注信息，类型为String，用于记录该打卡类型的一些备注信息
    private Integer status; //打卡类型的状态，类型为Integer，用于表示该打卡类型的状态，例如启用、禁用等状态
}

