package org.example.model;

import lombok.Data;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: RecordVo
 * @Datetime: 2023/05/28 17:35
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Data
public class RecordVo extends Records{
    //户主
    private String username;
    //门牌号
    private String numbers;
    //费用类型
    private String typename;
}

