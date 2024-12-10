package com.user.management.UserManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String role;
    private Date created_at;
}
