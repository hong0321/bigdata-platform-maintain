package yl.bigdata.doristask.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import yl.bigdata.doristask.entity.DorisRoutine;
import yl.bigdata.doristask.entity.RoutineVO;

import java.util.List;

@Component
public interface DorisRoutineMapper {

    List<DorisRoutine> getRoutineLoadInfoList(@Param("routineVO") RoutineVO routineVO);

    Long getRoutineLoadInfoTotal(@Param("routineVO") RoutineVO routineVO);

    DorisRoutine getRoutineLoadInfoByTaskName(String taskName);
}
