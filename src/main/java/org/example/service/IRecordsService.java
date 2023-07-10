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
    // 用于分页查询所有符合条件的 RecordVo 对象，page 表示页码，limit 表示每页条数，recordVo 表示查询条件
    PageInfo<RecordVo> findRecordsAll(int page, int limit, RecordVo recordVo);

    // 用于根据房屋ID和类型ID查询Records对象
    Records queryByHouIdAndTypeId(Integer houId, Integer typeId);

    // 添加Records对象
    int add(Records records);

    // 删除Records对象
    int delete(Long id);

    // 更新Records对象
    int updateData(Records userinfo);

    // 根据ID查询Records对象
    Records findById(Long id);
}
