package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.Repair;
import org.example.model.Tongji;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: RepairMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为RepairMapper的Java接口，用于操作Repair表的数据
 */
@Component("repairDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface RepairMapper extends BaseMapper<Repair> {
    // 查询所有的Repair对象，返回一个Repair对象的List集合
    List<Repair> queryRepairAll(Repair repair);
    // 统计Repair表中的数据
    List<Tongji> queryTongji();
}
