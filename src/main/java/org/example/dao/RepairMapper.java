package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.Repair;
import org.example.model.Tongji;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: RepairMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public interface RepairMapper extends BaseMapper<Repair> {
    List<Repair> queryRepairAll(Repair repair);
    //统计处理
    List<Tongji> queryTongji();
}
