package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @ClassName: PropertyInfo
 * @Datetime: 2023/05/28 02:19
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Data   //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false) //自动生成equals和hashCode方法，用于对象比较
@Accessors(chain = true)  //自定义链式调用的参数,返回当前对象
@ApiModel(value="PropertyInfo对象", description="") //定义了一个名为"PropertyInfo对象"的类，用于描述一个打卡记录对象,没有详细的描述信息
@TableName("property_info") // Mybatis-Plus注解，用于指定对应的数据库表名

public class PropertyInfo implements Serializable {
    // 序列化相关的内容，用于将Java对象转换为字节流，便于在网络中传输或持久化到磁盘中
    private static final long serialVersionUID=1L;
    // 物业费用信息的ID，类型为Integer，使用了@TableId注解指定了该字段为主键，主键类型为自增类型
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;
    private House house;    //物业费用对应的房屋信息，类型为House
    private Owner owner;    //物业费用对应的业主信息，类型为Owner
    private PropertyType type; //物业费用类型信息，类型为PropertyType
    private Integer typeId; //物业费用类型ID，类型为Integer
    private Double money;   // 物业费用金额，类型为Double
    // 物业费用开始时间，类型为Date，使用了@JsonFormat注解指定了日期格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;
    // 物业费用结束时间，类型为Date，使用了@JsonFormat注解指定了日期格式
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;
    // 物业费用状态，类型为Integer。用于表示物业费用的状态，一般使用0表示未支付，1表示已支付
    private Integer status;
    private Integer houseId;    //物业费用对应的房屋ID，类型为Integer
    private String remarks;     //物业费用备注信息，类型为String

}

