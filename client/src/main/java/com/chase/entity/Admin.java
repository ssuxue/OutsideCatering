package com.chase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chase
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private long id;
    private String username;
    private String password;
}
