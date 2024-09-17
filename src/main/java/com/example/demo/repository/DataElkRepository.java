package com.example.demo.repository;

import com.example.demo.entity.DataElk;
import com.example.demo.prjection.DataCon;
import com.example.demo.prjection.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataElkRepository extends JpaRepository<DataElk, Integer> {
    List<DataCon> getDataElkByCountry(String country);

    @Query(value = "select d.invoice_number AS invoiceNumber, d.customer_id AS customerId, d.country AS country from tablefunction.getbyfunction(:country) d", nativeQuery = true)
    List<DataCon> getWithFunction(String country);

    @Query(value = "select e.user_id as userId from tablefunction.testprojection() e", nativeQuery = true)
    List<UserInfo> getProjectionNoEntity();
}
