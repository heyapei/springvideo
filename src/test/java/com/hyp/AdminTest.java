package com.hyp;

import com.hyp.dataobject.Journal;
import com.hyp.dataobject.ResourceUrl;
import com.hyp.service.JournalService;
import com.hyp.service.VideoImgService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 15:34
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AdminTest {

    @Autowired
    private VideoImgService adminService;

    @Autowired
    private JournalService journalService;

    @Test
    public void showOneArticle() {
        List<ResourceUrl> articleByUserId = adminService.getVideoImgs();
        log.info("结果：" + articleByUserId.toString());
    }


    @Test
    public void showOArticle() {
        List<Journal> articleByUserId = journalService.getJournals();
        log.info("结果：" + articleByUserId.toString());
    }
}