package com.tech.enrollment.controller;

import com.tech.enrollment.model.Enrollment;
import com.tech.enrollment.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return service.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getEnrollmentById(@PathVariable Long id) {
        return service.getEnrollmentById(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Enrollment> getEnrollmentsByStudentId(@PathVariable Long studentId) {
        return service.getEnrollmentsByStudentId(studentId);
    }

    @GetMapping("/course/{courseId}")
    public List<Enrollment> getEnrollmentsByCourseId(@PathVariable Long courseId) {
        return service.getEnrollmentsByCourseId(courseId);
    }

    @PostMapping
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment) {
        return service.saveEnrollment(enrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable Long id) {
        service.deleteEnrollment(id);
    }
}
