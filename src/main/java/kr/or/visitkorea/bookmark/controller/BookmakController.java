package kr.or.visitkorea.bookmark.controller;

import kr.or.visitkorea.bookmark.dto.BookmarkDto;
import kr.or.visitkorea.bookmark.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookmark")
@RequiredArgsConstructor
public class BookmakController {

    private final BookmarkService bookmarkService;

    @GetMapping("/find/{userId}")
    public List<BookmarkDto> find(@PathVariable Integer userId) {
        List<BookmarkDto> bookmarkDto = bookmarkService.findContent(userId);
        return bookmarkDto;
    }
}
