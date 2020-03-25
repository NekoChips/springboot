package com.demo.template.dao2;

import com.demo.template.bean.Employee;

import java.util.List;

/**
 * @author NekoChips
 * @description 员工数据处理层接口
 * @date 2020/3/25
 */
public interface IEmployeeDao {

    /**
     * 新增员工信息
     * @param employee 员工信息
     * @return
     */
    int add(Employee employee);

    /**
     * 删除学生信息
     * @param emNo 员工编号
     * @return
     */
    int delete(String emNo);

    /**
     * 更新员工信息
     * @param employee 员工信息
     * @return
     */
    int update(Employee employee);

    /**
     * 查询员工信息
     * @param emNo 员工编号
     * @return
     */
    Employee queryById(String emNo);

    /**
     * 查询所有员工信息的员工列表
     * @return
     */
    List<Employee> queryList();
}
