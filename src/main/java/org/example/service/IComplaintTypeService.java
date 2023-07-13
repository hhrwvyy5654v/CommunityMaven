package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.model.ComplaintType;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IComplaintTypeService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IComplaintTypeService接口，继承了IService接口，并定义了一些对ComplaintType表进行操作的方法
 */

public interface IComplaintTypeService extends IService<ComplaintType> {
    // 用于分页查询所有符合条件的ComplaintType对象的方法，page表示页码，pageCount表示每页的记录数
    IPage<ComplaintType> findListByPage(Integer page, Integer pageCount);

    // 用于查询所有的投诉类型
    List<ComplaintType> queryType();

    // 添加ComplaintType对象
    int add(ComplaintType complaintType);

    // 删除ComplaintType对象
    int delete(Long id);

    // 更新ComplaintType对象
    int updateData(ComplaintType complaintType);

    // 根据ID查询Building对象
    ComplaintType findById(Long id);
}
