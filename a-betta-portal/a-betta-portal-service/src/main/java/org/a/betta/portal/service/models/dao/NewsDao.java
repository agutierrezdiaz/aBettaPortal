package org.a.betta.portal.service.models.dao;

import org.a.betta.portal.service.models.documents.News;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NewsDao extends ReactiveMongoRepository<News, String> {
	
}
