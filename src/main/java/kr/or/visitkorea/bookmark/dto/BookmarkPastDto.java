package kr.or.visitkorea.bookmark.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BookmarkPastDto {

    private String bookmarkPastId;
    private LocalDateTime pastCancelDate;
    private String bookmark;




}
