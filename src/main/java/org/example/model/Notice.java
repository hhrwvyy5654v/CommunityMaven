package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Notice
 * @Datetime: 2023/05/28 02:11
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Notice实体类的定义，对应数据库中的一张表
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Notice对象", description = "") //定义了一个名为"Notice对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Notice implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 公告信息的ID，类型为Integer，使用了@TableId注解指定了该字段为主键,主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String topic;   //公告主题，类型为String
    private String content; //公告内容，类型为String
    private Date fbdate;    //公告发布日期，类型为Date
    private String fbr;     //公告发布人，类型为String
    private String remarks; //公告备注信息，类型为String
}

