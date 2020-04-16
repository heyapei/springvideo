package com.hyp.service.impl;

import com.hyp.dataobject.Journal;
import com.hyp.mapper.JournalMapper;
import com.hyp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 10:39
 * @Description: TODO
 */
@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    private JournalMapper journalMapper;


    @Override
    public List<Journal> getJournals() {
        Example example = new Example(Journal.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createTime").desc();
        criteria.andEqualTo("status", 1);

        List<Journal> JournalList = journalMapper.selectByExample(example);
        if (JournalList != null && JournalList.size() > 0) {
            return JournalList;
        } else {
            return null;
        }
    }

    @Override
    public Journal getJournalById(Integer id) {
        Journal journal = journalMapper.selectByPrimaryKey(id);
        if (journal != null) {
            return journal;
        } else {
            return null;
        }
    }


    @Override
    public int addViewNum(Integer id) {

        Journal journal = journalMapper.selectByPrimaryKey(id);
        if (journal == null) {
            return -1;
        }
        Integer viewNum = journal.getViewNum();
        journal.setViewNum(viewNum + 1);
        int i = journalMapper.updateByPrimaryKey(journal);
        return i;
    }
}
