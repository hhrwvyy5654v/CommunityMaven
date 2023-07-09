package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.RecordVo;
import org.example.model.Records;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IRecordsService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IRecordsService接口，继承了IService接口，并定义了一些对RecordsService表进行操作的方法
 */

public interface IRecordsService extends IService<Records> {
    PageInfo<RecordVo> findRecordsAll(int page, int limit, RecordVo recordVo);
    Records queryByHouIdAndTypeId(Integer houId, Integer typeId);
    int add(Records records);
    int delete(Long id);
    int updateData(Records userinfo);
    Records findById(Long id);
}
