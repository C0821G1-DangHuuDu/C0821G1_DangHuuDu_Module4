package com.codegym.controller.employee;

import com.codegym.dto.employee.EmployeeDto;
import com.codegym.model.employee.Employee;
import com.codegym.service.employee.IDivisionService;
import com.codegym.service.employee.IEducationDegreeService;
import com.codegym.service.employee.IEmployeeService;
import com.codegym.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @GetMapping("/list")
    public String listEmployee(Model model, @RequestParam(value = "page", defaultValue = "0")int page){
        Sort sort = Sort.by("id").descending();
        Page<Employee> employeePage = employeeService.findAll(PageRequest.of(page,3,sort));
        model.addAttribute("employeePage", employeePage);
        return "employee/view";
    }

    @GetMapping ("/create")
    public String createViewPage (Model model){
        model.addAttribute("employee", new EmployeeDto());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        return "employee/create";
    }

    @PostMapping("/create")
    public String createNewEmployee(@Valid @ModelAttribute ("employee") EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new EmployeeDto().validate(employeeDto, bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("positions", positionService.findAll());
            model.addAttribute("educationDegrees", educationDegreeService.findAll());
            return "/employee/create";
        }
        employeeService.save(employeeDto);
        redirectAttributes.addFlashAttribute("msg","Create Employee successfully!");
        return "redirect:/employee/list";
    }

    @PostMapping("/search")
    public String findByName(@RequestParam("nameFind")String name, Model model, @PageableDefault(value = 2)Pageable pageable){
        model.addAttribute("employeePage", employeeService.findByName(pageable,name));
        return "employee/view";
    }

    @GetMapping("/edit")
    public String editPage(@RequestParam("id")Integer id, Model model){
        model.addAttribute("employee", employeeService.findById(id));
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String editEmployee(@Valid @ModelAttribute("employee")EmployeeDto employeeDto, BindingResult bindingResult,RedirectAttributes redirectAttributes, Model model){
        new EmployeeDto().validate(employeeDto, bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("positions", positionService.findAll());
            model.addAttribute("educationDegrees", educationDegreeService.findAll());
            return "/employee/create";
        }
        employeeService.save(employeeDto);
        redirectAttributes.addFlashAttribute("msg","Edit Employee successfully!");
        return "redirect:/employee/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id")Integer id, RedirectAttributes redirectAttributes){
        employeeService.deleteById(id);
        redirectAttributes.addFlashAttribute("msg","Delete Employee successfully!");
        return "redirect:/employee/list";
    }

}
