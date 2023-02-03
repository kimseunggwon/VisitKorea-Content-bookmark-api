package kr.or.visitkorea.api.entity;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class ContentEntity {

    @Id
    @Column(name = "contentId")
    private String contentId;
    @Column(name = "title")
    private String title;
    @Column(name = "type")
    private Integer type;



}
