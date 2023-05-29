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
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Complaint对象", description="")

public class Complaint implements Serializable {
    private static final long serialVersionUID=1L;
    private Owner owner;
    private Complaint type;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String comId;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date comDate;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date handleDate;

    private Integer ownerId;
    private Integer crl;
    private String remarks;
}

