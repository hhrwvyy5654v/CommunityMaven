package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Building;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: IBuildingService
 * @Datetime: 2023/05/29 17:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IBuildingService接口，继承了IService接口，并定义了一些对Building表进行操作的方法
 */

public interface IBuildingService extends IService<Building> {
    // 用于分页查询所有符合条件的Building对象的方法，page表示页码，pageSize表示每页条数，numbers表示查询条件
    PageInfo<Building> findBuildAll(int page, int pageSize, String numbers);

    // 分页信息查询Building对象
    IPage<Building> findListByPage(Integer page, Integer pageCount);

    // 添加Building对象
    int add(Building building);

    // 根据ID删除Building对象
    int delete(Long id);

    // 更新Building对象
    int updateData(Building building);

    // 根据ID查询Building对象
    Building findById(Long id);

    // 根据buildId查询Building对象
    Building queryBuildById(Integer buildId);
}

