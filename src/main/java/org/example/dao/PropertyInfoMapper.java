package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.PropertyInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: PropertyInfoMapper
 * @Datetime: 2023/05/29 09:59L
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为PropertyInfoMapper的Java接口，用于操作PropertyInfo表的数据
 */
@Component("propertyInfoDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface PropertyInfoMapper extends BaseMapper<PropertyInfo> {
    // 根据房子ID和登记时间删除记录信息
    void deleteByHouIdAndTime( @Param("houId") Integer houId, @Param("endDate") String onTime);
    // 查询所有的PropertyInfo对象，返回一个PropertyInfo对象的List集合
    List<PropertyInfo> queryListAll(PropertyInfo propertyInfo);
}
