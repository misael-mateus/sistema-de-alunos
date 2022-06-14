package br.com.bep.argonaut.persistence.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "identity_number", nullable = false)
    private String identityNumber;
    @Column(name = "student_since", nullable = false)
    private LocalDate studentSince;
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthDate;
    @Column(name = "cellphone", nullable = false)
    private Long cellPhone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "postal_code", nullable = false)
    private String postalCode;
    @Column(name = "address_line", nullable = false)
    private String addressLine;
    @Column(name = "monthly_bill")
    private double monthlyBill;
    @Column(name = "last_pay_date")
    private LocalDate lastPayDate;

}
