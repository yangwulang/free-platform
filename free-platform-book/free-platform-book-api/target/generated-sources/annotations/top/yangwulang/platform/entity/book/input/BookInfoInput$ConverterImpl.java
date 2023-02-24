package top.yangwulang.platform.entity.book.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-24T16:44:58+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
class BookInfoInput$ConverterImpl implements BookInfoInput.Converter {

    @Override
    public BookInfo toBookInfo(BookInfoInput input) {
        if ( input == null ) {
            return null;
        }

        BookInfoDraft.MapStruct bookInfo = new BookInfoDraft.MapStruct();

        bookInfo.bookName( input.getBookName() );
        bookInfo.author( input.getAuthor() );
        bookInfo.describe( input.getDescribe() );

        return bookInfo.build();
    }
}
