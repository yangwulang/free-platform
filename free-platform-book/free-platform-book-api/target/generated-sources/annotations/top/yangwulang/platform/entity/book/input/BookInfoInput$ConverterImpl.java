package top.yangwulang.platform.entity.book.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-16T21:59:56+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
class BookInfoInput$ConverterImpl implements BookInfoInput.Converter {

    @Override
    public BookInfo toBookInfo(BookInfoInput input) {
        if ( input == null ) {
            return null;
        }

        BookInfoDraft.MapStruct bookInfo = new BookInfoDraft.MapStruct();

        return bookInfo.build();
    }
}
