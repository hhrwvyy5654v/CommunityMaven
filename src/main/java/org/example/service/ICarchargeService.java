package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Carcharge;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: ICarchargeService
 * @Datetime: 2023/06/01 21:49
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个ICarchargeService接口，继承了IService接口，并定义了一些对Carcharge表进行操作的方法
 */

public interface ICarchargeService extends IService<Carcharge> {
    // 用于分页查询所有符合条件的Carcharge对象的方法，page表示页码，pageSize表示每页条数，numbers表示查询条件
    PageInfo<Carcharge> findCarchargeAll(int page, int pageSize, Carcharge carcharge);

    // 分页信息查询Carcharge对象
    IPage<Carcharge> findListByPage(Integer page, Integer pageCount);

    // 添加Carcharge对象
    int add(Carcharge carcharge);

    // 删除Carcharge对象
    int delete(Long id);

    // 更新Carcharge对象
    int updateData(Carcharge carcharge);

    // 根据ID查询Carcharge对象
    Carcharge findById(Long id);
}
