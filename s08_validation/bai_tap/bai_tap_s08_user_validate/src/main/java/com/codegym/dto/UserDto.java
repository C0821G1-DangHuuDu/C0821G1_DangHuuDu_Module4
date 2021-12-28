package com.codegym.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDto {

    @NotNull (message = "Không được để trống id")
    @NotBlank (message = "Không được để trống id")
    @NotEmpty (message = "Không được để trống id")
    private Integer id;
    @NotNull (message = "Không được để trống id")
    @NotBlank (message = "Không được để trống id")
    @NotEmpty (message = "Không được để trống id")
    private String firstName;
    @NotNull (message = "Không được để trống id")
    @NotBlank (message = "Không được để trống id")
    @NotEmpty (message = "Không được để trống id")
    private String lastName;

    private String phoneNumber;
    @NotNull (message = "Không được để trống id")
    @NotBlank (message = "Không được để trống id")
    @NotEmpty (message = "Không được để trống id")
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
}
