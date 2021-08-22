package cn.xd.service;

import cn.xd.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface BookService {
    //add
    int addBook(Books books);
    //delete
    int deleteBookById(int id);
    //update
    int updateBook(Books books);
    //query
    Books queryBookById(int id);

    List<Books> queryAllBooks();

    Books queryBookByName(String bookName);
}
