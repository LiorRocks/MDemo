package com.lior.MenoraDemo.db;

import com.lior.MenoraDemo.model.RootDocument;
import org.springframework.data.repository.CrudRepository;

public interface RootDocumentRepository extends CrudRepository<RootDocument, Long> {
}
