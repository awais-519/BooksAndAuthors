package auh.springframework.spring5webapp.Repositories;

import auh.springframework.spring5webapp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
