package yl.bigdata.doristask.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yl.bigdata.doristask.Utilt.PageResultVo;
import yl.bigdata.doristask.entity.BrokerVO;
import yl.bigdata.doristask.entity.DorisBroker;
import yl.bigdata.doristask.mapper.DorisBrokerMapper;

import java.util.List;


@Service
public class DorisBrokerServiceImpl {

    @Autowired
    DorisBrokerMapper dorisBrokerMapper;

    public PageResultVo<List<DorisBroker>> getBrokerLoadInfoList(BrokerVO brokerVO) {


//        1.获取总条数
        Long total = dorisBrokerMapper.getBrokerLoadInfoTotal(brokerVO);
//        1.2.如果总条数等于0，返回空对象。if（total == 0）
        if (total.intValue() == 0) {
            return new PageResultVo<List<DorisBroker>>();
        }

//        2.根据页码和每页条数取数据范围
        brokerVO.init();
//        3.查询数据
        List<DorisBroker> dorisBrokers = dorisBrokerMapper.getBrokerLoadInfoList(brokerVO);
        return new PageResultVo<>(brokerVO.getCurrent(), brokerVO.getSize(), total, dorisBrokers);
    }

//    根据taskName查询数据
    public DorisBroker getBrokerLoadInfoByTaskName(String taskName) {
        return dorisBrokerMapper.getBrokerLoadInfoByTaskName(taskName);
    }
}
