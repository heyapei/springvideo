package com.hyp.service;

import com.hyp.dataobject.blog.Journal;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 10:37
 * @Description: TODO
 */
public interface JournalService {


    /**
     * 按照时间排序获取所有status为1的内容
     *
     * @return
     */
    List<Journal> getJournals();

    /**
     * 通过视频ID查询日志信息
     *
     * @param id
     * @return
     */
    Journal getJournalById(Integer id);


    /**
     * 添加观看人数
     *
     * @param id
     * @return
     */
    int addViewNum(Integer id);

    /**
     * 添加数据
     *
     * @param journal
     * @return
     */
    int addJournal(Journal journal);


}
