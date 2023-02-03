package kr.or.visitkorea.bookmark.service;

import kr.or.visitkorea.api.dto.ContentListDto;
import kr.or.visitkorea.api.entity.ContentEntity;
import kr.or.visitkorea.api.repository.JpaContentListRepository;
import kr.or.visitkorea.bookmark.dto.BookmarkConUserDto;
import kr.or.visitkorea.bookmark.dto.BookmarkDto;
import kr.or.visitkorea.bookmark.entity.BookmarkEntity;
import kr.or.visitkorea.bookmark.entity.BookmarkPastEntity;
import kr.or.visitkorea.bookmark.repository.BookmarkPastRepository;
import kr.or.visitkorea.bookmark.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    private final JpaContentListRepository jpaContentListRepository;

    private final BookmarkPastRepository bookmarkPastRepository;

    /*
     userId로 북마크 전체 콘텐츠 조회
     */
    @Transactional
    public List<BookmarkDto> findContent(Integer userId){

        List<BookmarkDto> rtn = new ArrayList<>();

        String sUserId = bookmarkRepository.findByUserId(userId).toString();
        if(!ObjectUtils.isEmpty(sUserId)) {
            throw new RuntimeException("등록되자 않은 사용자입니다");
        }

        //userId로 조회
        List<BookmarkEntity> find = bookmarkRepository.findByUserId(userId);

        for(BookmarkEntity bookmarkEntity : find) {
            BookmarkDto bookmarkDto = new BookmarkDto();
            //bookmarkDto.setUserId(bookmarkEntity.getUserId);

            //String contentId = bookmarkEntity.getContentId();
            //ContentEntity contentEntity = JpaContentListRepository.findById(contentId).get();
            ContentListDto contentListDto = new ContentListDto();
            //contentListDto.setContentId(contentEntity.getContentId());


            rtn.add(bookmarkDto);
        }

        return rtn;
    }


    public void bookSave(BookmarkConUserDto bookmarkConUserDto) {
        //어플리케이션 실행시 한 번만 실행
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("");

        // 한 번의 트랜잭션 당 하나
        EntityManager entityManager = factory.createEntityManager();
        // 트랜잭션 생성 및 시작
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            //북마크 생성
            BookmarkEntity bookmarkEntity = new BookmarkEntity();
            bookmarkEntity.createBook();
            //bookmarkEntity.status("bookmark");
            //bookmarkEntity.getContentId();

            //제거
            if(bookmarkEntity.equals("bookmark")){

            }

            //저장
            bookmarkRepository.save(bookmarkEntity);

            BookmarkPastEntity bookmarkPastEntity = new BookmarkPastEntity();

            bookmarkPastRepository.save(bookmarkPastEntity);

            //과거 기록
            //List<BookmarkEntity> bookmarkEn =bookmarkRepository.findByContentIdAndUserId();


            transaction.commit();

        } catch (Exception e) {

        }

    }

}
