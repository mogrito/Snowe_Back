package com.capstone.snowe.mapper;

import com.capstone.snowe.dto.TeacherDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    /*
    * 관리자가 강사를 추가
    * */
    void addTeacher(String id);

    /*
    * 강사가 추가되면 member테이블의 perCode를 수정
    * */
    void perCodeUpdate(String id);

    /*
    * 강사 정보 수정
    * */
    void updateTeacherStat(TeacherDTO teacherDTO);
}
