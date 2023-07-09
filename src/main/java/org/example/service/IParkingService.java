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
    PageInfo<Parking> findParkAll(int page, int pageSize, String numbers);

    IPage<Parking> findListByPage(Integer page, Integer pageCount);

    int add(Parking parking);

    int delete(Long id);

    int updateData(Parking parking);

    Parking findById(Long id);

    List<Parking> queryParkingAll();

    List<Parking> queryParkingByStatus();
}
