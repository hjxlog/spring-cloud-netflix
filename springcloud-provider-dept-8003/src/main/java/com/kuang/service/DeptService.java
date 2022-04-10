package com.kuang.service;


import com.kuang.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();
}
