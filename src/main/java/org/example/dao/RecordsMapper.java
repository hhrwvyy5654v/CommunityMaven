package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.RecordVo;
import org.example.model.Records;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: RecordsMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public interface RecordsMapper extends BaseMapper<Records> {
    //查询所有的记录信息
    List<RecordVo> queryRecordsAll(RecordVo recordVo);
    //根据房子id和类型id获取最后一次记录信息
    Records queryByHouIdAndTypeId(@Param("houId")Integer houId,@Param("typeId") Integer typeId);
}
