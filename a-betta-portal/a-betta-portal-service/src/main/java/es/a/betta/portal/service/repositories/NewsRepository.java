package es.a.betta.portal.service.repositories;

import es.a.betta.portal.service.models.documents.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<News, String> {

}
