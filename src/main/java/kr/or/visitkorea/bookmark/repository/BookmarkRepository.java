package kr.or.visitkorea.bookmark.repository;

import kr.or.visitkorea.bookmark.dto.BookmarkConUserDto;
import kr.or.visitkorea.bookmark.dto.BookmarkPastDto;
import kr.or.visitkorea.bookmark.entity.BookmarkEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookmarkRepository {

    private final EntityManager entityManager;

    public BookmarkEntity save(BookmarkEntity bookmarkEntity) {
        entityManager.persist(bookmarkEntity);
        return bookmarkEntity;
    }

    public BookmarkEntity update(BookmarkPastDto BookmarkPastDto) {

        return null;
    }

    public List<BookmarkEntity> findByUserId(Integer userId) {
        String jpql = "";
        BookmarkEntity em = new BookmarkEntity();

//        EntityManager em = entityManager.createQuery()
//                .setParameter("userId", userId)
//                .getResultList();
                //.setParameter("북마크 상태");

        return (List<BookmarkEntity>) em;
    }

    public List<BookmarkEntity>findByContentIdAndUserId(BookmarkConUserDto bookmarkRequestDto){
        String jpql = "";
        BookmarkEntity em = new BookmarkEntity();

        //EntityManager em = entityManager.createQuery(jpql,BookmarkEntity.class)
                //.setParameter("contendId",bookmarkRequestDto.getContentId)
                //.setParameter("userId",bookmarkRequestDto.getUserId);

        return (List<BookmarkEntity>) em;
    }
}
