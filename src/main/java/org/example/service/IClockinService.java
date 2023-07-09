package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Clockin;

import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IClockinService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IClockinService接口，继承了IService接口，并定义了一些对Clockin表进行操作的方法
 */

public interface IClockinService extends IService<Clockin> {
    // 用于分页查询所有的打卡记录，接收页码、每页条数和"Clockin"对象作为参数，并返回一个"PageInfo"对象，其中包含查询结果
    PageInfo<Clockin> queryClockInAll(int pageNum, int pageSize, Clockin clockin);

    // 用于分页查询打卡记录，接收页码和每页条数作为参数
    IPage<Clockin> findListByPage(Integer page, Integer pageCount);

    // 用于添加打卡记录，接收一个"Clockin"对象作为参数
    int add(Clockin clockin);

    // 用于删除打卡记录，接收一个主键ID作为参数
    int delete(Long id);

    // 用于更新打卡记录，接收一个"Clockin"对象作为参数
    int updateData(Clockin clockin);

    // 用于根据ID查询打卡记录，接收一个ID作为参数
    Clockin findById(Long id);

    // 用于根据ID查询打卡记录，接收一个ID作为参数
    Date queryCountByOwnIdAndTime(Integer ownId);

}
