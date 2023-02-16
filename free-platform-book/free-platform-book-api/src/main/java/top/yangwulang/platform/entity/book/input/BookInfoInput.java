package top.yangwulang.platform.entity.book.input;

import lombok.Data;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.book.BookInfo;

@Data
public class BookInfoInput implements Input<BookInfo> {

    private static final BookInfoInput.Converter CONVERTER = Mappers.getMapper(BookInfoInput.Converter.class);

    private String bookName;

    private String author;

    private String describe;

    @Override
    public BookInfo toEntity() {
        return CONVERTER.toBookInfo(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        BookInfo toBookInfo(BookInfoInput input);

    }
}
