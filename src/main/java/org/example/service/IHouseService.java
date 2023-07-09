package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
    PageInfo<House> findHouseAll(int page, int pageSize, String numbers);
    List<House> findList();
    IPage<House> findListByPage(Integer page, Integer pageCount);
    int add(House house);
    int delete(Long id);
    int updateData(House house);
    House findById(Long id);
    House queryHouseById(Integer houId);
}
