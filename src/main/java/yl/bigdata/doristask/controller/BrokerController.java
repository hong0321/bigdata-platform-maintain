package yl.bigdata.doristask.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yl.bigdata.doristask.Utilt.PageResultVo;
import yl.bigdata.doristask.entity.BrokerVO;
import yl.bigdata.doristask.entity.DorisBroker;
import yl.bigdata.doristask.entity.ResponseInfo;
import yl.bigdata.doristask.serviceImpl.DorisBrokerServiceImpl;
import java.util.List;


@CrossOrigin
@Controller
@RequestMapping("/dorisBroker")
public class BrokerController {

    @Autowired
    DorisBrokerServiceImpl dorisBrokerServiceImpl;

    @PostMapping("/getBrokerLoadInfoList")
    @ResponseBody
    @ApiOperation(value = "查询Broker Load任务信息")
    public ResponseInfo getBrokerLoadInfoList(@RequestBody BrokerVO brokerVO) {

        try {
            PageResultVo<List<DorisBroker>> listPageResultVo = dorisBrokerServiceImpl.getBrokerLoadInfoList(brokerVO);
            return ResponseInfo.success("请求成功", listPageResultVo);
        } catch (Exception e) {
            return ResponseInfo.error("请求失败");
        }
    }

    @GetMapping("/getBrokerLoadInfoByTaskName")
    @ResponseBody
    @ApiOperation(value = "根据任务名称查询Broker Load任务信息")
    public ResponseInfo getBrokerLoadInfoByTaskName(String taskName) {

        try {
            DorisBroker dorisBrokerByTaskName = dorisBrokerServiceImpl.getBrokerLoadInfoByTaskName(taskName);
            return ResponseInfo.success("请求成功", dorisBrokerByTaskName);
        } catch (Exception e) {
            return ResponseInfo.error("请求失败");
        }
    }

}
