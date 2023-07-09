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
    IPage<Userinfo> findListByPage(Integer page, Integer pageCount);

    PageInfo<Userinfo> findUserinfoAll(int page, int pageSize, Userinfo userinfo);

    int add(Userinfo userinfo);

    int delete(Long id);

    int updateData(Userinfo userinfo);

    Userinfo findById(Long id);

    Userinfo queryUserByNameAndPwd(Userinfo userinfo);

    void deleteUserByUsername(String username);
}
