package com.capstone.snowe.service;

import com.capstone.snowe.dto.MemberDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.security.auth.login.LoginException;


public interface MemberService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    MemberDTO checkLogin(String username,String password) throws LoginException;

    MemberDTO signup(MemberDTO params);

    MemberDTO findMemberByLoginId(String loginId);

    int countMemberByLoginId(String loginId);

    int checkNickname(String nickname);
}