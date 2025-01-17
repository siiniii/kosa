package com.example.springedu.controller;

import com.example.springedu.dao.BookMapperDAO;
import com.example.springedu.dao.BookMybatisDAO;
import com.example.springedu.domain.BookMybatisDTO;
import com.example.springedu.domain.MeetingDTO;
import com.example.springedu.domain.VisitorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
//    @Autowired
//    BookMybatisDAO dao;

    @Autowired
    BookMapperDAO dao;

    @RequestMapping("/book")
    public String loadBookPage() {
        return "bookPage";
    }

    @GetMapping(value = "/bookinfo/{option}")
    public ModelAndView bookInfo(@PathVariable String option) {
        ModelAndView mav = new ModelAndView();
        List<BookMybatisDTO> list = null;
    switch (option){
        case "b1": list = dao.b1();
        break;
        case "b2": list = dao.b2();
        break;
        case "b3": list = dao.b3();
        break;
        case "b4": list = dao.b4();
        break;
        case "b5": list = dao.b5();
        break;
        case "b6": list = dao.b6("자바");
        break;
        case "b7": list = dao.b6("스프링");
        break;
        case "b8": list = dao.b7();
        break;
    }
        if (list.size() != 0) {
            mav.addObject("list", list);
        } else {
            mav.addObject("msg", "추출된 결과가 없어용");
        }
        mav.setViewName("bookPage");
        return mav;
    }

    @GetMapping("/bookCreate")
    public String loadBookCreatePage(){
        return "bookCreatePage";
    }
    @PostMapping("/bookCreate")
    public String insertBookData(BookMybatisDTO bookMybatisDTO, Model model) {
        boolean result = dao.insert(bookMybatisDTO);
        if(result) {
            model.addAttribute("newBook", bookMybatisDTO);
        } else {
            model.addAttribute("msg", "도서 등록에 실패하였습니다.");
        }
        return "bookCreatePage";

    }

}
