package kr.or.visitkorea.bookmark.dto;

import ch.qos.logback.core.status.Status;
import kr.or.visitkorea.api.dto.ContentListDto;
import lombok.Data;

@Data
public class BookmarkDto {

    private Integer userId;
    private Integer bookmarkId;
    private ContentListDto contentListDto;

    private Status status;

    //북마크 상태 컬럼
}
