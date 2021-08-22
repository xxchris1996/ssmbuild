package cn.xd.dao;

import cn.xd.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //add
    int addBook(Books books);
    //delete
    int deleteBookById(@Param("bookId") int id);
    //update
    int updateBook(Books books);
    //query
    Books queryBookById(@Param("bookId") int id);

    List<Books> queryAllBooks();

    Books queryBookByName(@Param("bookName") String bookName);
}
