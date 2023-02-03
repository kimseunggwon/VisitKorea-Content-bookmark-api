package kr.or.visitkorea.api.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ContentDetailDto {

    private String contentDetailId;
    private String thumnail;
    private Integer sidoCode;
    private Integer sggCode;
    private Double longitude;
    private Double latitude;
}
