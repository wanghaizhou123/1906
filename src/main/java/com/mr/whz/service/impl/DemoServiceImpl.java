package com.mr.whz.service.impl;

import com.mr.whz.entity.DemoEntity;
import com.mr.whz.mapper.DemoEntityMapper;
import com.mr.whz.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MrSwagger2Config
 * @Description: TODO
 * @Author wanghaizhou
 * @Date 2019/12/17
 * @Version V1.0
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoEntityMapper mapper;


    @Override
    public List list() {
        return mapper.list();
    }

    @Override
    public void demoSave(List<DemoEntity> personVoList) {

        mapper.demoSave(personVoList);
    }
}
