package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BooksRestRespository extends PagingAndSortingRepository<Book, Long> {
    List<Book> findByName(@Param("name") String name);
}
