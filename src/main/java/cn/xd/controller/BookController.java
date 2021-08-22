package cn.xd.controller;

import cn.xd.pojo.Books;
import cn.xd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    //查询全部书籍，并返回书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }
    //添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addbook=>"+books);
       bookService.addBook(books);
       return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id, Model model){
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("Qbooks", books);
        return "updateBook";
    }

    //修改书籍请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updatebook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍请求
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        System.out.println("deletebook=>"+id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
//    //删除书籍请求
//    @RequestMapping("/deleteBook/{bookId}")
//    public String deleteBook(@PathVariable("bookId")  int id){
//        System.out.println("deletebook=>"+id);
//        bookService.deleteBookById(id);
//        return "redirect:/book/allBook";
//    }
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<>();
        list.add(books);
        if(books == null) {
            list = bookService.queryAllBooks();
            model.addAttribute("error", "未查询到该书籍");
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
