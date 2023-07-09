package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.RepairType;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: RepairtypeMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为RepairtypeMapper的Java接口，用于操作Repairtype表的数据
 */

// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface RepairtypeMapper extends BaseMapper<RepairType> {
}
