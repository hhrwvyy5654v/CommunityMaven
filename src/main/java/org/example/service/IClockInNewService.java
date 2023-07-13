package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Carcharge;
import org.example.model.Clockinnew;

import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IClockInNewService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IClockInNewService接口，继承了IService接口，并定义了一些对ClockInnew表进行操作的方法
 */


public interface IClockInNewService extends IService<Clockinnew> {
    // 用于分页查询所有符合条件的Clock对象的方法，page表示页码，pageSize表示每页条数，numbers表示查询条件
    PageInfo<Carcharge> queryClockInAll(int page, int pageSize, Carcharge carcharge);

    // 分页信息查询Clockinnew对象
    IPage<Clockinnew> findListByPage(Integer page, Integer pageCount);

    // 添加Clockinnew对象
    int add(Clockinnew clockinnew);

    // 删除Clockinnew对象
    int delete(Long id);

    // 更新Clockinnew对象
    int updateData(Clockinnew clockinnew);

    // 根据ID查询Clockinnew对象
    Clockinnew findById(Long id);

    // 根据用户id查询其打卡次数
    Date queryCountByOwnId(Integer ownerId);
}
