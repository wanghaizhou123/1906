package com.mr.whz.service;

import com.mr.whz.entity.DemoEntity;

import java.util.List;

public interface DemoService {

    List list();

    void demoSave(List<DemoEntity> personVoList);
}
