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
    // 用于分页查询所有符合条件的Repair对象，page表示页码，pageSize表示每页条数，repair表示查询条件
    PageInfo<Repair> findRepairAll(int page, int pageSize, Repair repair);

    // 用于查询所有的Repair对象
    List<Repair> queryList();

    // 用于分页查询Repair对象，page表示页码，pageCount表示每页条数
    IPage<Repair> findListByPage(Integer page, Integer pageCount);

    // 添加Repair对象
    int add(Repair repair);

    // 删除Repair对象
    int delete(Long id);

    // 更新Repair对象
    int updateData(Repair repair);

    // 根据ID查询Repair对象
    Repair findById(Long id);

    // 查询统计信息
    List<Tongji> queryTongji();
}
