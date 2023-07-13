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
 * @ClassName: Building
 * @Datetime: 2023/05/26 16:54
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Building实体类的定义，对应数据库中的一张表
 */

@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，简化代码编写
@Accessors(chain = true) // 使用Lombok中的@Accessors注解，可以自定义链式调用的参数，如chain=true表示setter方法返回当前对象
@ApiModel(value = "Building对象", description = "") //使用了Swagger中的@ApiModel注解，用于生成API文档时的注释

public class Building implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 使用Mybatis-Plus中的@TableId注解，用于指定表的主键字段，value表示字段名，type表示主键类型，这里是自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 主键ID，自增类型
    private String numbers; // 楼栋编号，字符串类型
    private String uints; // 单元号，字符串类型
    private String remarks; // 备注信息，字符串类型

}

