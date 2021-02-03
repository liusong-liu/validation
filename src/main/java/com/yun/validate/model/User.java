package com.yun.validate.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 用户
 */
@Data
public class User implements Serializable {
    private int id;
    @NotNull(message = "{user.name.notnull}")
    @Size(min = 4, max = 20,message = "{user.name.size}")
    private String name;
    @Size(min = 8, max = 24, message = "{user.password.size}")
    private String password;
    @NotNull(message = "{user.address.notnull}")
    private String address;
    @DecimalMin(value = "1")
    @DecimalMax(value = "99")
    private int age;
    @NotNull
    @Email
    private String email;
}
