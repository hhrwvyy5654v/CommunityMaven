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
    IPage<RepairType> findListByPage(Integer page, Integer pageCount);

    List<RepairType> findList();

    int add(RepairType repairtype);

    int delete(Long id);

    int updateData(RepairType repairtype);

    RepairType findById(Long id);
}
