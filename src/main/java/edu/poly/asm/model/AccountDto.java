package edu.poly.asm.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    @NotEmpty
    @Length(min = 6)
    private String username;
    @NotEmpty
    @Length(min = 6)
    private String password;

    private Boolean isEdit = false;
}
