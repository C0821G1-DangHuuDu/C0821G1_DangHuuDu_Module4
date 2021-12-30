package com.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDto implements Validator {

    @NotNull (message = "Không được để trống id")
    private Integer id;
    @NotNull (message = "Không được để trống firstName")
    @NotBlank (message = "Không được để trống firstName")
    @NotEmpty (message = "Không được để trống firstName")
    private String firstName;
    @NotNull (message = "Không được để trống lastName")
    @NotBlank (message = "Không được để trống lastName")
    @NotEmpty (message = "Không được để trống lastName")
    private String lastName;

    private String phoneNumber;
    @NotNull (message = "Không được để trống age")
    @Min(18)
    private Integer age;

    private String email;

    public UserDto() {
    }

    public UserDto(Integer id, String lastName, String firstName, String phoneNumber, Integer age, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if (!userDto.firstName.matches("[A-z]{5,45}")){
            errors.rejectValue("firstName", "firstName.invalidFormat");
        }
        if (!userDto.lastName.matches("[A-z]{5,45}")){
            errors.rejectValue("lastName", "lastName.invalidFormat");
        }
        if (!userDto.phoneNumber.matches("[0-9]{10}")){
            errors.rejectValue("phoneNumber", "phoneNumber.invalidFormat");
        }
//        if (!(userDto.age>=18)){
//            errors.rejectValue("age", "age.invalidFormat");
//        }
        if (!userDto.email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)")){
            errors.rejectValue("email", "email.invalidFormat");
        }
    }
}
