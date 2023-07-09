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
 * @ClassName: Complaint
 * @Datetime: 2023/05/28 01:54
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Complaint实体类的定义，对应数据库中的一张表
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true) //自定义链式调用的参数,返回当前对象
@ApiModel(value = "Complaint对象", description = "") //定义了一个名为"Complaint对象"的类，用于描述一个打卡记录对象,没有详细的描述信息

public class Complaint implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    private Owner owner;    //投诉的业主信息
    private Complaint type; // 投诉的类型，字段可能为空
    // 指定了id字段为主键，字段类型为Integer，主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String comId;   // 投诉编号，类型为String
    // 投诉日期，类型为Date，使用了@JsonFormat注解指定了日期格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date comDate;
    // 处理日期，类型为Date，使用了@JsonFormat注解指定了日期格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date handleDate;
    private Integer ownerId;     // 业主的ID，类型为Integer
    private Integer crl;        // 表示处理结果，类型为Integer
    private String remarks;    //备注信息，类型为String
}

