package com.aiguigu.rest.controller;

import com.aiguigu.rest.controller.bean.Employee;
import com.aiguigu.rest.controller.dao.EmployeeDao;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.Collection;

/**
 * @projectName: SpringMVC
 * @package: com.aiguigu.rest.controller
 * @className: EmployeeController
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/21 21:28
 * @version: 1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "employee", method = RequestMethod.GET)
    public ModelAndView getAllEmployee(ModelAndView modelAndView) {
        Collection<Employee> employeeList = employeeDao.getAll();
        modelAndView.setViewName("employee_list");
        modelAndView.addObject("employeeList", employeeList);
        return modelAndView;
    }
    @RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
    public ModelAndView getEmployeeById(@PathVariable("id") Integer id,ModelAndView modelAndView) {
        Employee employee = employeeDao.get(id);
        modelAndView.addObject("employee",employee);
        modelAndView.setViewName("employee_update");
        return modelAndView;
    }
    @RequestMapping(value = "employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }
    @RequestMapping(value = "employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
    @RequestMapping(value = "employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
