package kr.or.visitkorea.bookmark.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.engine.spi.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkEntity {

    @Id
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "bookmarkId")
    private Integer bookmarkId;

    @Column(name = "contetnId;")
    private Integer contetnId;

    @Column
    private Status status;


    public void createBook() {

    }

    //생성
    public void saveBook() {

    }

    //수정
    public void update() {

    }

//    public void toString(String 북마크_상태) {
//    }
}
