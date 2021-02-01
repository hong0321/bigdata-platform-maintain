package yl.bigdata.doristask.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yl.bigdata.doristask.Utilt.PageResultVo;
import yl.bigdata.doristask.entity.DorisRoutine;
import yl.bigdata.doristask.entity.RoutineVO;
import yl.bigdata.doristask.mapper.DorisRoutineMapper;
import java.util.List;

@Service
public class DorisRoutineServiceImpl {

    @Autowired
    DorisRoutineMapper dorisRoutineMapper;

    public PageResultVo<List<DorisRoutine>> getRoutineLoadInfoList(RoutineVO routineVO) {
//doris不支持PageHelper
//        PageHelper.startPage(routineVO.getCurrent(), routineVO.getSize());
//        List<DorisRoutine> dorisRoutines = dorisRoutineMapper.getRoutineLoadInfoList(routineVO);
//        PageInfo<DorisRoutine> dorisRoutine = new PageInfo<>(dorisRoutines);
//        PageResultVo<List<DorisRoutine>> objectPageResultVo = new PageResultVo<>(routineVO.getCurrent(), dorisRoutine.getTotal(), dorisRoutine.getList());
//        objectPageResultVo.setSize(dorisRoutine.getSize());
//        return objectPageResultVo;

        Long total = dorisRoutineMapper.getRoutineLoadInfoTotal(routineVO);
        if (total.intValue() == 0){
            return new PageResultVo<List<DorisRoutine>>();
        }
        routineVO.init();

        List<DorisRoutine> dorisRoutines = dorisRoutineMapper.getRoutineLoadInfoList(routineVO);
        return new PageResultVo<>(routineVO.getCurrent(),routineVO.getSize(), total, dorisRoutines);
    }

    public DorisRoutine getRoutineLoadInfoByTaskName(String taskName) {
        return dorisRoutineMapper.getRoutineLoadInfoByTaskName(taskName);
    }
}
