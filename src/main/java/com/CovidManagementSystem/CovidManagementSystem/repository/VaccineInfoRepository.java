package com.CovidManagementSystem.CovidManagementSystem.repository;

import com.CovidManagementSystem.CovidManagementSystem.model.VaccineInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineInfoRepository extends MongoRepository<VaccineInfo, String> {
}
