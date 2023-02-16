package top.yangwulang.platform.entity.book.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.book.BookChapter;

@Data
public class BookChapterInput implements Input<BookChapter> {

    private static final BookChapterInput.Converter CONVERTER = Mappers.getMapper(BookChapterInput.Converter.class);

    private String chapterTitle;

    private String bookId;

    @Override
    public BookChapter toEntity() {
        return CONVERTER.toBookChapter(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        BookChapter toBookChapter(BookChapterInput input);

    }
}
