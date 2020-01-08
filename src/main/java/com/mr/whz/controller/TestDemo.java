package com.mr.whz.controller;

import com.mr.whz.entity.DemoEntity;
import com.mr.whz.service.DemoService;
import com.mr.whz.utils.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName MrSwagger2Config
 * @Description: TODO
 * @Author wanghaizhou
 * @Date 2019/12/17
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "demo")
public class TestDemo {

    @Autowired
    private DemoService service;


    @GetMapping
    public void exportExcel(HttpServletResponse response){
        //查询数据库t_demo 的数据
        List demoList = service.list();
        //将查询出的list放入easypoi工具类导出
        try {
            ExcelUtiles.exportExcel(demoList, "测试信息表", "测试信息", DemoEntity.class, "测试信息", response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @PostMapping
    public String importExcel(@RequestBody @RequestParam("file") MultipartFile file) throws IOException {

        List<DemoEntity> personVoList = ExcelUtiles.importExcel(file, DemoEntity.class);

        service.demoSave(personVoList);

        return  "导入成功";
    }

}