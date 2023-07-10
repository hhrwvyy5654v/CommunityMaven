package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Userinfo;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IUserinfoService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IUserinfoService接口，继承了IService接口，并定义了一些对UserinfoService表进行操作的方法
 */

public interface IUserinfoService extends IService<Userinfo> {
    // 用于分页查询Userinfo对象，page表示页码，pageCount表示每页条数
    IPage<Userinfo> findListByPage(Integer page, Integer pageCount);

    // 用于分页查询所有符合条件的Userinfo对象，page表示页码，pageSize表示每页条数，userinfo表示查询条件
    PageInfo<Userinfo> findUserinfoAll(int page, int pageSize, Userinfo userinfo);

    // 添加Userinfo对象
    int add(Userinfo userinfo);

    // 删除Userinfo对象
    int delete(Long id);

    // 更新Userinfo对象
    int updateData(Userinfo userinfo);

    // 根据ID查询Userinfo对象
    Userinfo findById(Long id);

    // 根据用户名和密码查询Userinfo对象，userinfo表示要查询的用户名和密码
    Userinfo queryUserByNameAndPwd(Userinfo userinfo);

    // 根据用户名删除Userinfo对象
    void deleteUserByUsername(String username);
}
