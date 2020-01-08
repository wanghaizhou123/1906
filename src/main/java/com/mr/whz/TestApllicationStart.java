package com.mr.whz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MrSwagger2Config
 * @Description: TODO
 * @Author wanghaizhou
 * @Date 2019/12/17
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan(value = "com.mr.whz.mapper")
public class TestApllicationStart {

    public static void main(String[] args) {

        SpringApplication.run(TestApllicationStart.class);

    }

}
