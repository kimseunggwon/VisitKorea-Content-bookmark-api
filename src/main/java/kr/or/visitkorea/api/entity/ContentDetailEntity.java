package kr.or.visitkorea.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class ContentDetailEntity {

    @Id
    @Column(name = "id")
    private String contentDetailId;

    @Column(name = "thumbnail")
    private String thumnail;

    @Column(name = "sido_code")
    private Integer sidoCode;

    @Column(name = "sgg_code")
    private Integer sggCode;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;
}
