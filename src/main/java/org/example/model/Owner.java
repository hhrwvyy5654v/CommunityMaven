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

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Owner对象", description="")

public class Owner implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;
    private String username;
    private String tel;
    private String sex;
    private String identity;
    private Integer houseId;
    private String remarks;
    private String password;
    // 房屋信息
    private  House house;

}

