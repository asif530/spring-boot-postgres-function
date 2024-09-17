package com.example.demo.repository;

import com.example.demo.entity.DummyEntity;
import com.example.demo.prjection.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
* this does not work...Possible soln: create dummy entity and write queries there
* DummyEntity Works
* */
@Repository
public interface TestProjectionRepository extends CrudRepository<DummyEntity,Integer> {
    @Query(value = "select e.user_id as userId from tablefunction.testprojection() e", nativeQuery = true)
    List<UserInfo> getProjectionNoEntity();
}
