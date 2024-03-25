package com.infer.signup;

import lombok.*;

@AllArgsConstructor
@Data
@Setter@Getter




    public class UserDto {

        private String username;
        private String email;
        private String phoneNum;
        private String password;
        // Add other fields as needed

        // Constructors, getters, setters

        public UserDto() {
        }


        // Getters and setters for other fields
    }


