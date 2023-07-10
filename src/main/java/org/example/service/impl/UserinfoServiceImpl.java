package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.UserinfoMapper;
import org.example.model.Userinfo;
import org.example.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: UserinfoServiceImpl
 * @Datetime: 2023/06/01 21:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IUserinfoService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<UserinfoMapper, Userinfo>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

    @Autowired  // 将UserinfoMapper对象注入到UserinfoServiceImpl类中的houseDao属性中
    private UserinfoMapper userinfoMapper;  // 一个userinfoMapper类型的属性，用于进行数据库操作

    @Override
    // 分页查询用户信息
    public IPage<Userinfo> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Userinfo> wherePage = new Page<>(page, pageCount);
        // 创建一个Userinfo对象，作为查询条件
        Userinfo where = new Userinfo();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 分页查询所有的用户信息
    public PageInfo<Userinfo> findUserinfoAll(int page, int pageSize, Userinfo userinfo) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pageSize);
        // 调用userinfoMapper的queryBuildAll方法来查询建筑信息
        List<Userinfo> list = userinfoMapper.queryUserinfoAll(userinfo);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<Userinfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    // 添加用户信息
    public int add(Userinfo userinfo) {
        // 调用baseMapper的insert方法来插入数据
        return baseMapper.insert(userinfo);
    }

    @Override
    // 删除用户信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新用户信息
    public int updateData(Userinfo userinfo) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.updateById(userinfo);
    }

    @Override
    // 根据ID查询用户信息
    public Userinfo findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }

    @Override
    // 根据给定的用户名和密码查询用户信息
    public Userinfo queryUserByNameAndPwd(Userinfo userinfo) {
        return userinfoMapper.queryUserByNameAndPwd(userinfo);
    }

    @Override
    // 删除指定用户名的用户信息
    public void deleteUserByUsername(String username) {
        userinfoMapper.deleteUserByUsername(username);
    }
}

