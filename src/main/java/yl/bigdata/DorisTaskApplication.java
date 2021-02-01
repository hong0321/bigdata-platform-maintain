package yl.bigdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@MapperScan("yl.bigdata.doristask.mapper")
@SpringBootApplication
@RestController
public class DorisTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(DorisTaskApplication.class, args);
    }

}
