package kr.or.visitkorea.bookmark.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkPastEntity {

    @Id
    @Column
    private String BookmarkPastId;

    @Column
    private LocalDateTime pastCancelDate;

    @Column
    private String bookmark;

}
