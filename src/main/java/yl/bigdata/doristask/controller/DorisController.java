package yl.bigdata.doristask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yl.bigdata.doristask.serviceImpl.DorisServiceImpl;

@Controller
@RequestMapping("/testBoot")
public class DorisController {

    @Autowired
    DorisServiceImpl dorisServiceImpl;

    @RequestMapping("query")
    @ResponseBody
    public Integer query(){
        System.out.println(dorisServiceImpl.query());
        return dorisServiceImpl.query();
    }
}
