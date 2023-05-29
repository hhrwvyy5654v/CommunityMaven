package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.PropertyInfo;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: PropertyInfoMapper
 * @Datetime: 2023/05/29 09:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public interface PropertyInfoMapper extends BaseMapper<PropertyInfo> {
    //根据登记时间和房子id当前记录信息
    void deleteByHouIdAndTime( @Param("houId") Integer houId, @Param("endDate") String onTime);
    List<PropertyInfo> queryListAll(PropertyInfo propertyInfo);
}
