package yl.bigdata.doristask.mapper;

import yl.bigdata.doristask.entity.DorisLoadTask;
import java.util.List;

public interface DorisLoadTaskMapper {

//    1.新增
    void insert(DorisLoadTask dorisloadtask);

//   2. 查询所有
    List<DorisLoadTask> selectDorisloadtaskAll();

    //3.根据任务编号查询
    DorisLoadTask queryDorisLoadTaskByLabel(String label);

//    4.修改
    void updateDorisLoadTask(DorisLoadTask dorisloadtask);

//    5.删除
    void deleteDorisLoadTaskByLabel(String label);
}
