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
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Repairtype对象", description="")
public class Repairtype implements Serializable {
    private static final long serialVersionUID=1L;
    @TableId(value = "id",type=IdType.AUTO)
    private Integer id;
    private String name;
    private String remarks;
    private Integer status;
}

