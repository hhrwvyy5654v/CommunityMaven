package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.RecordVo;
import org.example.model.Records;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: RecordsMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个名为RecordsMapper的Java接口，用于操作Records表的数据
 */
@Component("recordsDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface RecordsMapper extends BaseMapper<Records> {
    // 查询所有的Records对象，返回一个RecordVo对象的List集合
    List<RecordVo> queryRecordsAll(RecordVo recordVo);

    // 根据房子ID和类型ID获取最后一次记录信息
    Records queryByHouIdAndTypeId(@Param("houId") Integer houId, @Param("typeId") Integer typeId);
}
