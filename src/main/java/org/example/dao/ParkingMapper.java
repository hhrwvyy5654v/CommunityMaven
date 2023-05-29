package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Parking;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: ParkingMapper
 * @Datetime: 2023/05/28 01:47
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为ParkingMapper的Java接口，用于操作Parking表的数据
 */
@Component("parkingDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface ParkingMapper extends BaseMapper<Parking> {
    // 分页查询所有的Parking对象，返回一个Parking对象的List集合
    List<Parking> queryParkAll(@Param("number") String numbers);
    // 查询所有正在使用的Parking对象，返回一个Parking对象的List集合
    List<Parking> queryParkAllByStatus();
}
