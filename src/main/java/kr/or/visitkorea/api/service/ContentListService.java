package kr.or.visitkorea.api.service;

import kr.or.visitkorea.api.dto.ContentListDto;
import kr.or.visitkorea.api.entity.ContentEntity;
import kr.or.visitkorea.api.repository.JpaContentListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContentListService {

    private final JpaContentListRepository jpaContentListRepository;

    /*
     콘텐츠 목록 조회
     */
    @Transactional
    public List<ContentListDto> findContentList(int size, int pageNo) {
        List<ContentEntity> rtn = jpaContentListRepository.find(size,pageNo);

        List<ContentListDto> ContentListDtoList = new ArrayList<>();

        for(ContentEntity contentListDto1 : rtn) {
            ContentListDto contentListDto = new ContentListDto();
            contentListDto.setContentId(contentListDto1.getContentId());
            contentListDto.setTitle(contentListDto1.getTitle());
            contentListDto.setType(contentListDto1.getType());
            contentListDto.setThumnail(contentListDto.getThumnail());
            contentListDto.setSggCode(contentListDto.getSggCode());
            contentListDto.setSidoCode(contentListDto.getSidoCode());

            ContentListDtoList.add(contentListDto);
            log.info("ContentListDtoList = ",ContentListDtoList);
        }

        return ContentListDtoList;
    }

    /*
     주변 콘텐츠 목록 조회
     */

}
