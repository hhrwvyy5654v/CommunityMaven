package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Parking;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IParkingService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IParkingService接口，继承了IService接口，并定义了一些对HouseService表进行操作的方法
 */

public interface IParkingService extends IService<Parking> {
    // 用于分页查询所有符合条件的 Parking 对象，page 表示页码，pageSize 表示每页条数，numbers 表示查询条件
    PageInfo<Parking> findParkAll(int page, int pageSize, String numbers);

    // 用于分页查询 Parking 对象，page 表示页码，pageCount 表示每页条数
    IPage<Parking> findListByPage(Integer page, Integer pageCount);

    // 添加Parking对象
    int add(Parking parking);

    // 删除Parking对象
    int delete(Long id);

    // 更新Parking对象
    int updateData(Parking parking);

    // 根据ID查询Parking对象
    Parking findById(Long id);

    // 查询所有的Parking对象
    List<Parking> queryParkingAll();

    // 根据状态查询Parking对象
    List<Parking> queryParkingByStatus();
}
