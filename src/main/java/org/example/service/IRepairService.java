package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Repair;
import org.example.model.Tongji;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IRepairService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IRepairService接口，继承了IService接口，并定义了一些对RepairService表进行操作的方法
 */

public interface IRepairService extends IService<Repair> {
    PageInfo<Repair> findRepairAll(int page, int pageSize, Repair repair);

    List<Repair> queryList();

    IPage<Repair> findListByPage(Integer page, Integer pageCount);

    int add(Repair repair);

    int delete(Long id);

    int updateData(Repair repair);

    Repair findById(Long id);

    List<Tongji> queryTongji();
}
