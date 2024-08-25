package edu.poly.asm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private int customerId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private Date registreredDate;
    private short status;

    private Boolean isEdit = false;
}
