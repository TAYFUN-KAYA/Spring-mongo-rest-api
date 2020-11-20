package com.twoproject.repository;

// veri tabanından getir gibi işlemleri yapacak katman

import com.twoproject.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici,String> {



}
