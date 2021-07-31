package BOOKBROWSING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class BookBrowsingController {

    @Autowired
    private BookBrowsingRepository repo;

    @GetMapping(value ="/ ")
    public BookBrowsing getBookByGenre(
            @PathVariable( value = "genre") String genre){

        return repo.findByGenre(genre);
    }


    @GetMapping(value ="/ ")
    public BookBrowsing getBookByCopies_Sold(
            @PathVariable( value = "copies_sold") String copies_sold){

        return repo.findByCopies_Sold(copies_sold);
    }


    @GetMapping(value ="/ ")
    public BookBrowsing getBookByRating(
            @PathVariable( value = "rating") String rating){

        return repo.findByRating(rating);
    }






}
