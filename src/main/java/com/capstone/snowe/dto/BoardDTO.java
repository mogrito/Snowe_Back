package com.capstone.snowe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class BoardDTO {


    private int boardId;    //게시글 id

    private String loginId;  //작성자 id

    private String title; //게시글 제목

    private String content;     //게시글 내용

    private LocalDate createDate;     //작성일자

    private int recommendCount;    //추천수

    private int viewCount;          //조회수

    private String delYn;           //삭제유무

    private int commentCount;     //댓글수

    private String category;        // 카테고리

    private String filePath;        // 파일경로
    
    private String fileSName;       // 파일의 저장이름

    private List<BoardFileDTO> boardFile;   // DB에 전달하기 위해 생성


}
