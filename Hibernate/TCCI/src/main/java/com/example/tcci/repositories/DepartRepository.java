package com.example.tcci.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.IOException;

@Repository
public class DepartRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void salvar() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/InsertDepartment");
        String INSERT = IOUtils.toString(fis, "UTF-8");
        Query query = entityManager.createNativeQuery(INSERT);
        query.executeUpdate();
    }
}