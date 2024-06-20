package com.tech.teacher.service;

import com.tech.teacher.model.Teacher;
import com.tech.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repository;

    public List<Teacher> getAllTeachers() {
        return repository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return repository.findById(id);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return repository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        repository.deleteById(id);
    }
}
