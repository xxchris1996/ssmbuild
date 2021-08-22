package cn.xd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class SeckillController {


    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(Model model){
//        List<Seckill> list = seckillService.getSeckillList();
//        model.addAttribute("list", list);
        System.out.println("1111111111111111111111111111");
        return "test";//WEB-INF/jsp/list.jsp
    }

}
