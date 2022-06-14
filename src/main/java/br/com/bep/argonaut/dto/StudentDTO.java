package br.com.bep.argonaut.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentDTO {

    private String name;
    private String identityNumber;
    private LocalDate studentSince;
    private LocalDate birthDate;
    private Long cellPhone;
    private String email;
    private String postalCode;
    private String addressLine;
    private double monthlyBill;
    private LocalDate lastPayDate;

}
