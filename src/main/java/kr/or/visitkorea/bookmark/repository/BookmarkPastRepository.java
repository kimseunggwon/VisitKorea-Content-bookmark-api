package kr.or.visitkorea.bookmark.repository;

import kr.or.visitkorea.bookmark.entity.BookmarkEntity;
import kr.or.visitkorea.bookmark.entity.BookmarkPastEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class BookmarkPastRepository {

    private final EntityManager entityManager;

    public BookmarkPastEntity save(BookmarkPastEntity bookmarkPastEntity) {
        entityManager.persist(bookmarkPastEntity);
        return bookmarkPastEntity;
    }
}
