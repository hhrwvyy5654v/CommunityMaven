package org.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: Userinfo
 * @Datetime: 2023/05/28 19:41
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public class Userinfo implements Serializable {
    private static final long serialVersionUID=1L;
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private Integer type;
    private String remarks;
}

