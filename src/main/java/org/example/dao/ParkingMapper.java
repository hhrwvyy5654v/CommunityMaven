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
 * @Description:
 */
@Component("parkingDao")
public interface ParkingMapper extends BaseMapper<Parking> {
    // 分页查询车位信息
    List<Parking> queryParkAll(@Param("number") String numbers);
    // 查询使用的车位信息
    List<Parking> queryParkAllByStatus();
}
