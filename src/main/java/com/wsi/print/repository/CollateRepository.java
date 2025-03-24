package com.wsi.print.repository;

import com.wsi.print.entity.Collates;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollateRepository extends CrudRepository<Collates, Long> {

    List<Collates> findAll();

    @Query(value = "SELECT * FROM Collates c WHERE c.tc_lpn_id = :tc_lpn_id", nativeQuery = true)
    Collates findByLpn(String tc_lpn_id);

}
