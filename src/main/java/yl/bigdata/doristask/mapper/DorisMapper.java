package yl.bigdata.doristask.mapper;


import org.springframework.stereotype.Repository;
import yl.bigdata.doristask.entity.Doris;

@Repository
public interface DorisMapper {
    Integer query();
}
