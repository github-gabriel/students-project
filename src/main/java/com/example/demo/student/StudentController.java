package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudent(Model model) {

        model.addAttribute("students", studentService.getStudents());

        return "students";

    }

    @GetMapping("/students/new")
    public String registerNewStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/error")
    public String error(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        model.addAttribute("error", status);
        return "redirect:/error";
    }

    @PostMapping("/students")
    public String registerNewStudent(@ModelAttribute("student") Student student) {
        studentService.addNewStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student) {

        studentService.updateStudent(id, student.getFirstName(), student.getLastName(), student.getEmail());
        return "redirect:/students";
    }

//    @GetMapping
//    public List<Student> getStudents() {
//        return studentService.getStudents();
//    }
//
//    @PostMapping
//    public void registerNewStudent(@RequestBody Student student) {
//        studentService.addNewStudent(student);
//    }
//
//    @DeleteMapping(path = "{studentId}")
//    public void deleteStudent(@PathVariable("studentId") Long studentId) {
//        studentService.deleteStudent(studentId);
//    }
//
//    @PutMapping(path = "{studentId}")
//    public void updateStudent(
//            @PathVariable("studentId") Long studentId,
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String email) {
//        studentService.updateStudent(studentId, name, email);
//    }

}
