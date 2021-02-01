package yl.bigdata.doristask.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yl.bigdata.doristask.entity.DorisLoadTask;
import yl.bigdata.doristask.mapper.DorisLoadTaskMapper;

import java.util.List;

@Service
public class DorisLoadTaskServiceImpl implements DorisLoadTaskMapper {

    @Autowired
    DorisLoadTaskMapper dorisloadtaskMapper;

    @Override
    public void insert(DorisLoadTask dorisloadtask) {
        // 实现insert？
        dorisloadtaskMapper.insert(dorisloadtask);
    }

    @Override
    public List<DorisLoadTask> selectDorisloadtaskAll() {

        return dorisloadtaskMapper.selectDorisloadtaskAll();
    }

    @Override
    public DorisLoadTask queryDorisLoadTaskByLabel(String label) {
        return dorisloadtaskMapper.queryDorisLoadTaskByLabel(label);
    }

    @Override
    public void updateDorisLoadTask(DorisLoadTask dorisloadtask) {
        dorisloadtaskMapper.updateDorisLoadTask(dorisloadtask);
    }

    @Override
    public void deleteDorisLoadTaskByLabel(String label) {
        dorisloadtaskMapper.deleteDorisLoadTaskByLabel(label);
    }


}
