package com.capstone.snowe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberFormDTO {
    private  String email;
    private  String username;
    private  String pw;
    private  String rrn;
}
