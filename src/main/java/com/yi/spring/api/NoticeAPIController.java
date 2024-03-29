package com.yi.spring.api;

import com.yi.spring.entity.Notice;
import com.yi.spring.repository.NoticeRepository;
import com.yi.spring.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class NoticeAPIController {

    @Autowired
    NoticeService noticeService;

    @Autowired
    NoticeRepository noticeRepository;

    @GetMapping("/noticeListAll")
    public ResponseEntity<List<Notice>> noticeListaAll() {

        List<Notice> noticePage = noticeRepository.findAll();

        return ResponseEntity.ok().body(noticePage);
    }

    @GetMapping("/noticeList")
    public ResponseEntity<Page<Notice>> noticeList(Model model,
                             @RequestParam(value = "page", defaultValue = "0") int page) {

        Page<Notice> noticeList = noticeService.findByNoticeDESC(page);
        return ResponseEntity.ok().body(noticeList);
    }

    @GetMapping("/notice_detail")
    public String noticeDetail(Model model,
                               @RequestParam int id,
                               @RequestParam(value = "page", defaultValue = "0") int page) {

        Optional<Notice> notice = noticeRepository.findById(id);

//        Page<Notice> noticeList = noticeService.findByAllDESC(page);
        Page<Notice> noticeList = noticeService.findByNoticeDESC(page);


        model.addAttribute("list", noticeList); // 수정된 부분: 검색 결과를 담도록 변경

        model.addAttribute("notice", notice); // 수정된 부분: 검색 결과를 담도록 변경


        return "/notice_detail";
    }

}
