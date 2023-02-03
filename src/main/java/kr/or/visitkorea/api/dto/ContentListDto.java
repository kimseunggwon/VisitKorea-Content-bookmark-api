package kr.or.visitkorea.api.dto;

import lombok.Data;

@Data
public class ContentListDto {

    private String contentId;
    private String title;
    private Integer type;
    private String thumnail;
    private Integer sidoCode;
    private Integer sggCode;
    private Integer distance;    //null 허용

}
