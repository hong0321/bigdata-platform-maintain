package yl.bigdata.doristask.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yl.bigdata.doristask.Utilt.PageResultVo;
import yl.bigdata.doristask.entity.DorisRoutine;
import yl.bigdata.doristask.entity.ResponseInfo;
import yl.bigdata.doristask.entity.RoutineVO;
import yl.bigdata.doristask.serviceImpl.DorisRoutineServiceImpl;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/DorisRoutine")
public class RoutineController {

    @Autowired
    DorisRoutineServiceImpl dorisRoutineServiceImpl;

    @PostMapping("/getRoutineLoadInfoList")
    @ResponseBody
    @ApiOperation(value = "查询Routine Load任务信息")
    public ResponseInfo getRoutineLoadInfoList(@RequestBody RoutineVO routineVO) {

        try {
            PageResultVo<List<DorisRoutine>> listPageResultVo = dorisRoutineServiceImpl.getRoutineLoadInfoList(routineVO);
            return ResponseInfo.success("请求成功", listPageResultVo);
        } catch (Exception e) {
            return ResponseInfo.error("请求失败");
        }
    }

    @GetMapping("/getRoutineLoadInfoByTaskName")
    @ResponseBody
    @ApiOperation(value = "根据任务名称查询Routine Load任务信息")
    public ResponseInfo getRoutineLoadInfoByTaskName(String taskName) {

        try {
            DorisRoutine dorisRoutineByTaskName = dorisRoutineServiceImpl.getRoutineLoadInfoByTaskName(taskName);
            return ResponseInfo.success("请求成功", dorisRoutineByTaskName);
        } catch (Exception e) {
            return ResponseInfo.error("请求失败");
        }
    }
}
