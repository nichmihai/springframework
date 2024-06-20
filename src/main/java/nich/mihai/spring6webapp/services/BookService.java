package nich.mihai.spring6webapp.services;

import nich.mihai.spring6webapp.domain.Book;

public interface BookService {
   Iterable<Book> findall();
}
