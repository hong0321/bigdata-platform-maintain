package yl.bigdata.doristask.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yl.bigdata.doristask.entity.DorisLoadTask;

import java.io.IOException;
import java.util.List;

import yl.bigdata.doristask.serviceImpl.DorisLoadTaskServiceImpl;

/**
 *
 */
@Controller
@RequestMapping("/Dorisloadtask")
public class DorisLoadTaskController {

    @Autowired
    DorisLoadTaskServiceImpl dorisloadtaskServiceImpl;

    @RequestMapping(value = "/insert")
    @ApiOperation(value ="新增任务")
    public String insert(DorisLoadTask dorisloadtask) throws JsonGenerationException, JsonMappingException, IOException{
        dorisloadtaskServiceImpl.insert(dorisloadtask);
        return "showDorisloadtask";
    }

    @GetMapping(value = "/selectDorisloadtask")
    @ApiOperation(value ="查询所有任务")
    @ResponseBody
//    public List<DorisLoadTask> selectDorisloadtask(DorisLoadTask dorisloadtask){
//        return dorisloadtaskServiceImpl.selectDorisloadtaskAll();
//    }
    public String selectDorisloadtask(Model model){
        List<DorisLoadTask> list = this.dorisloadtaskServiceImpl.selectDorisloadtaskAll();
//        model.addAttibute("List",list);
        return "showDorisloadtask";
    }

    @GetMapping("/queryDorisloadtaskByLable")
    @ApiOperation(value ="根据任务号查询任务")
    @ResponseBody
    public DorisLoadTask queryDorisLoadTaskByLabel(String label){
        return dorisloadtaskServiceImpl.queryDorisLoadTaskByLabel(label);
    }

    @PostMapping("/updateDorisLoadTask")
    @ApiOperation(value ="修改任务")
    @ResponseBody
    public String updateDorisLoadTaskByLabel(DorisLoadTask dorisloadtask){
        dorisloadtaskServiceImpl.updateDorisLoadTask(dorisloadtask);
        return "ok";
    }

    @PostMapping("/delDorisLoadTask")
    @ApiOperation(value ="根据label删除任务")
    @ResponseBody
    public String delDorisLoadTask(@RequestParam("label") String label){

        dorisloadtaskServiceImpl.deleteDorisLoadTaskByLabel(label);
        return "redirect:/Dorisloadtask/selectDorisloadtask";//"已删除"
    }

    /**
     *页面跳转
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String show(){

        return "page";
    }

//    @RequestMapping(value = "/showDorisloadtask",method = RequestMethod.GET)
//    public String showDorisloadtask(){
//        return "showDorisloadtask";
//    }

}

