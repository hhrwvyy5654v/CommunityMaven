package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Carchargs
 * @Datetime: 2023/05/26 17:35
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Data   //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Carcharge对象", description="")

public class Carcharge implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; //主键ID，自增类型
    //@JsonFormat注解是Jackson库中的注解，用于指定日期格式化的方式。它可以用于类、字段、方法等上面
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date payDate;   //缴费日期，日期类型
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private String endDate; //缴费截至日期，日期类型
    private Double money;   //缴费金额，浮点型
    private Integer status; //缴费状态，整型，可能的取值为0或1
    private Integer ownerId;    //所有者ID，整型
    private String remarks; //备注信息，字符串类型
    @ApiModelProperty(value = "收费类型")
    private String type;    //收费类型，字符串类型
    private Integer parkId; //停车位ID，整型
    private Owner owner;    //所有者对象，Owner类型
    private Parking parking;    //停车位对象，Parking类型
}

