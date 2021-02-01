package yl.bigdata.doristask.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yl.bigdata.doristask.mapper.DorisMapper;

@Service
public class DorisServiceImpl implements DorisMapper {

    @Autowired
    DorisMapper dorisMapper;

    @Override
    public Integer query() {
        return dorisMapper.query();
    }
}
