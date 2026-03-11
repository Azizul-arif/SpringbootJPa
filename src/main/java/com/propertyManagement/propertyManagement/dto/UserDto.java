package com.propertyManagement.propertyManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    @NotNull(message = "owner email is mandatory")
    @Size(min = 1,max = 50,message = "Owner Email should be between 1 to 50 charecter")
    private String ownerEmail;
    @NotNull
    private String ownerName;
    private String phone;
    @NotEmpty(message = "password cant be empty")
    @NotNull
    @Size(min=1,max=3,message="Password should be in between 1 to 3 charecter")
    private String password;
}
