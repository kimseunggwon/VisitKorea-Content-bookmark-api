package kr.or.visitkorea.api.controller;

import kr.or.visitkorea.api.dto.ContentListDto;
import kr.or.visitkorea.api.service.ContentListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/content")
public class ContentListController {

    private final ContentListService contentListService;

    /*
    콘텐츠 목록 조회
     */
    @GetMapping("/find/{size}/{pageNo}")
    public List<ContentListDto> find(@PathVariable int size,@PathVariable int pageNo) {
        List<ContentListDto> contentListDto = contentListService.findContentList(size, pageNo);
        return contentListDto;
    }
}
