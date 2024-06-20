package nich.mihai.spring6webapp.services;

import nich.mihai.spring6webapp.domain.Book;
import nich.mihai.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findall() {
        return bookRepository.findAll();
    }
}
