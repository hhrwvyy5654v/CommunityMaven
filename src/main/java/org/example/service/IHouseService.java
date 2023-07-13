package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.House;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IHouseService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IHouseService接口，继承了IService接口，并定义了一些对HouseService表进行操作的方法
 */

public interface IHouseService extends IService<House> {
    // 用于分页查询所有符合条件的House对象的方法，page表示页码，pageSize表示每页条数，numbers表示查询条件
    PageInfo<House> findHouseAll(int page, int pageSize, String numbers);

    // 用于查询所有的 House 对象
    List<House> findList();

    // 用于分页查询 House 对象
    IPage<House> findListByPage(Integer page, Integer pageCount);

    // 添加House对象
    int add(House house);

    // 删除House对象
    int delete(Long id);

    // 更新House对象
    int updateData(House house);

    // 根据ID查询House对象
    House findById(Long id);

    // 根据ID查询House对象
    House queryHouseById(Integer houId);
}
