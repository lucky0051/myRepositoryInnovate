package com.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @NotBlank
    @Column(name = "firstName")
    private String firstName;

    @NotBlank
    @Column(name = "lastName")
    private String lastName;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Column(name = "phoneNumbers")
    private List<String> phoneNumbers;

    @NotNull
    @Column(name = "doj")
    private LocalDate doj;

    @Positive
    @Column(name = "salary")
    private double salary;


}

