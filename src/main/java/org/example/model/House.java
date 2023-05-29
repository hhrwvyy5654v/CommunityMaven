package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: House
 * @Datetime: 2023/05/28 01:32
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public class House implements Serializable {
    private static final long serialVersionUID=1L;
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;
    private Integer storey;
    private String numbers;
    private Integer status;
    @JsonFormat(locale="zh",timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date intoDate;
    private Integer buildingId;
    private String remarks;
    private Double area;
}

