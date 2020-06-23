package org.a.betta.portal.service.repositories;

import org.a.betta.portal.service.models.documents.Articles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends MongoRepository<Articles, String> {

}
