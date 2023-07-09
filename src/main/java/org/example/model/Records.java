package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Records
 * @Datetime: 2023/05/28 17:27
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: Records实体类的定义，对应数据库中的一张表
 */

@Data //自动生成getter、setter、toString等方法,简化代码编写
public class Records implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    // 物业费用记录ID，类型为Integer，使用了@TableId注解指定了该字段为主键，主键类型为自增类型
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer typeId; //费用类型Id
    private Double num;     //上次度数，类型为Double，用于记录该费用类型上次抄表时的度数
    private Double num2;    //本次度数，类型为Double，用于记录该费用类型本次抄表时的度数
    private Integer houseId;    // 房屋ID，类型为Integer，用于表示该费用记录所属的房屋

    private String meter;   //抄表员，类型为String，用于记录该费用记录的抄表员
    // 表示上次抄表时间，类型为Date，使用了@JsonFormat注解指定了日期的格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date upTime;
    // 表示本次抄表时间，类型为Date，使用了@JsonFormat注解指定了日期的格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date onTime;
    // 表示登记时间，类型为Date，使用了@JsonFormat注解指定了日期的格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date checkTime;
    private String remarks; // 费用记录备注信息，类型为String，用于记录该费用记录的一些备注信息
}

