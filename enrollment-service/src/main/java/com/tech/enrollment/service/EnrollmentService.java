package com.tech.enrollment.service;

import com.tech.enrollment.model.Enrollment;
import com.tech.enrollment.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repository;

    public List<Enrollment> getAllEnrollments() {
        return repository.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(Long id) {
        return repository.findById(id);
    }

    public List<Enrollment> getEnrollmentsByStudentId(Long studentId) {
        return repository.findByStudentId(studentId);
    }

    public List<Enrollment> getEnrollmentsByCourseId(Long courseId) {
        return repository.findByCourseId(courseId);
    }

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return repository.save(enrollment);
    }

    public void deleteEnrollment(Long id) {
        repository.deleteById(id);
    }
}
