package kr.or.visitkorea.api.repository;

import kr.or.visitkorea.api.entity.ContentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class JpaContentListRepository {

     private final EntityManager entity;

     public List<ContentEntity> find(int size, int pageNo) {
          String jpql = "select c from ContentEntity c where c.type = 12 or c.type = 15";
          int startRow = (pageNo - 1) * size;

          return entity.createQuery(jpql, ContentEntity.class)
                  .setFirstResult(startRow)
                  .setMaxResults(size)
                  .getResultList();
     }

     // 콘텐츠 id로 조회
     public List<ContentEntity> findById(String contentId) {
          String jpql = "select c from ContentEntity c where c.contentId = :contentId";
          List<ContentEntity> contentEntity = new ArrayList<>();

          /*List<ContentEntity> contenEntity = entity.createQuery(jpql)
                  .setParameter("contentId",contentId);*/

          return contentEntity;
     }
}
