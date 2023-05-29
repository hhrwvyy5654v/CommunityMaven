package org.example.model;

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
 * @ClassName: Repair
 * @Datetime: 2023/05/28 19:41
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Data //自动生成getter、setter、toString等方法,简化代码编写
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Repair对象", description = "")

public class Repair implements Serializable {
    private static final long serialVersionUID=1L;
    private Owner owner;
    private Repairtype type;
    @TableId Integer id;
    private String comId;
    @JsonFormat(locale = "zh",timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date comDate;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date handleDate;
    private Integer ownerId;
    private Integer status;
    private Integer clr;
    private String remarks;
}

