package top.yangwulang.platform.entity.book.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookChapterDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-16T21:59:56+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
class BookChapterInput$ConverterImpl implements BookChapterInput.Converter {

    @Override
    public BookChapter toBookChapter(BookChapterInput input) {
        if ( input == null ) {
            return null;
        }

        BookChapterDraft.MapStruct bookChapter = new BookChapterDraft.MapStruct();

        return bookChapter.build();
    }
}
