package yl.bigdata.doristask.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import yl.bigdata.doristask.entity.BrokerVO;
import yl.bigdata.doristask.entity.DorisBroker;
import java.util.List;


@Component
public interface DorisBrokerMapper {

    List<DorisBroker> getBrokerLoadInfoList(@Param("brokerVO") BrokerVO brokerVO);

    Long getBrokerLoadInfoTotal(@Param("brokerVO") BrokerVO brokerVO);

    DorisBroker getBrokerLoadInfoByTaskName(String taskName);
}
