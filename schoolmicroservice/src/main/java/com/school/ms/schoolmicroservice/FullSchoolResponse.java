package com.school.ms.schoolmicroservice;

import lombok.*;

import java.util.List;

import com.student.ms.studentmicroservice.Student;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;
}