package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.model.RepairType;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IRepairtypeService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IRepairService接口，继承了IService接口，并定义了一些对RepairService表进行操作的方法
 */

public interface IRepairtypeService extends IService<RepairType> {
    // 用于分页查询RepairType对象，page表示页码，pageCount表示每页条数
    IPage<RepairType> findListByPage(Integer page, Integer pageCount);

    // 用于查询所有的RepairType对象
    List<RepairType> findList();

    // 添加RepairType对象
    int add(RepairType repairtype);

    // 删除RepairType对象
    int delete(Long id);

    //更新RepairType对象
    int updateData(RepairType repairtype);

    // 根据ID查询RepairType对象
    RepairType findById(Long id);
}
