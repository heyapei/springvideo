package com.hyp.controller.journal;

import com.hyp.dataobject.Journal;
import com.hyp.service.JournalService;
import com.hyp.vo.MyError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 9:20
 * @Description: TODO
 */
@Component("journalindex")
@Controller
@RequestMapping("/journal")
@Slf4j
public class Index {

    @Autowired
    private JournalService journalService;

    @RequestMapping(value = "")
    public String index() {
        return "forward:/journal/showlist";
    }


    @RequestMapping(value = "/showlist", method = RequestMethod.GET)
    public String showJournalList(ModelMap map) {
        List<Journal> journals = journalService.getJournals();
        log.info("查询结果：" + journals != null ? journals.toString() : "");
        map.put("journals", journals);

        return "journal/journalList";
    }


    @RequestMapping(value = "/showjournal")
    public String showJournal(@RequestParam String passWord, @RequestParam Integer journalId, ModelMap map) {
        Journal journal = journalService.getJournalById(journalId);
        if (journal == null) {
            log.info("做密码验证的时候查询出来空值了");
            MyError myError = new MyError(500, "No have Journal", "The Journal you want is not found. The resource may have been deleted by the administrator");
            map.put("myError", myError);
            return "myError/error";
        } else {
            if (!journal.getPassWord().equals(passWord)) {
                log.info("密码验证错误");
                MyError myError = new MyError(500, "Password ERROR", "You need to make sure your journal password is correct");
                map.put("myError", myError);
                return "myError/error";
            }
        }

        map.put("journal", journal);

        /*添加观看人次*/
        journalService.addViewNum(journalId);


        return "journal/showJournal";
    }


}
