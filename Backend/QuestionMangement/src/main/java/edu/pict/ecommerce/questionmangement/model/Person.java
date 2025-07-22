package edu.pict.ecommerce.questionmangement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
}

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Customer extends Person {
    private String custId;
    private String profilePic;
    private String membershipPeriod;
}

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee extends Person {
    private String role;
    private Double salary;
}

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class HRManager extends Employee {
    private Integer workingHours;
}

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Developer extends Employee {
    private String techStack;
}

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Housekeeper extends Employee {
    private String buildingNo;
}
