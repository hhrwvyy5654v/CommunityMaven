package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Notice;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: INoticeService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个INoticeService接口，继承了IService接口，并定义了一些对NoticeService表进行操作的方法
 */

public interface INoticeService extends IService<Notice> {
    // 用于分页查询所有符合条件的 Notice 对象，pageNum 表示页码，limit 表示每页条数，topic 表示查询条件
    PageInfo<Notice> queryNoticeAll(Integer pageNum, Integer limit, String topic);
    // 用于分页查询 Notice 对象，page 表示页码，pageCount 表示每页条数
    IPage<Notice> findListByPage(Integer page, Integer pageCount);
    // 添加Notice对象
    int add(Notice notice);
    // 删除Notice对象
    int delete(Long id);
    // 更新Notice对象
    int updateData(Notice notice);
    // 根据ID查询Notice对象
    Notice findById(long id);

}
