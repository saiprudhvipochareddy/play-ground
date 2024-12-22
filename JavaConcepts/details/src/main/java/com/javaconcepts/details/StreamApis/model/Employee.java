package com.javaconcepts.details.StreamApis.model;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee{

    private int id;
    private String name;
    private String dept;
    private List<Project> projects;
    private double salary;
    private String gender;

}
