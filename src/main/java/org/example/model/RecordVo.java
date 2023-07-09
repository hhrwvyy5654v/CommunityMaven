package org.example.model;

import lombok.Data;

/**
 * @Project: CommunityMaven
 * @Package: org.example.model
 * @ClassName: RecordVo
 * @Datetime: 2023/05/28 17:35
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: RecordVo实体类的定义，对应数据库中的一张表
 */

@Data   //自动生成getter、setter、toString等方法,简化代码编写
public class RecordVo extends Records {
    private String username;    //户主姓名，类型为String，用于表示该费用记录所属房屋的户主姓名
    private String numbers;     //门牌号，类型为String，用于表示该费用记录所属房屋的门牌号
    private String typename;    //费用类型名称，类型为String，用于表示该费用记录所属的费用类型名称
}

