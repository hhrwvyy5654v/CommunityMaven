package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Complaint;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IComplaintService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IComplaintService接口，继承了IService接口，并定义了一些对Complaint表进行操作的方法
 */

public interface IComplaintService extends IService<Complaint> {
    // 用于分页查询所有符合条件的Complaint对象的方法，page表示页码，pageSize表示每页条数，complaint表示查询条件
    PageInfo<Complaint> findComplaintAll(int page, int pageSize, Complaint complaint);

    // 用于分页查询所有的投诉记录
    IPage<Complaint> findListByPage(Integer page, Integer pageCount);

    // 用于添加投诉记录
    int add(Complaint complaint);

    // 用于删除投诉记录
    int delete(Long id);

    // 用于更新投诉记录
    int updateData(Complaint complaint);

    // 用于根据id查询投诉记录
    Complaint findById(Long id);

}
