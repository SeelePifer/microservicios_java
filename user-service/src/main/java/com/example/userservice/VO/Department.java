package com.example.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long deparmentId;
    private String deparmentName;
    private String deparmentAddress;
    private String departmentCode;
}
