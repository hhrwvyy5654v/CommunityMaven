package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.PropertyType;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: PropertyTypeMapper
 * @Datetime: 2023/05/29 09:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为PropertyTypeMapper的Java接口，用于操作PropertyType表的数据
 */

// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface PropertyTypeMapper extends BaseMapper<PropertyType> {
}
