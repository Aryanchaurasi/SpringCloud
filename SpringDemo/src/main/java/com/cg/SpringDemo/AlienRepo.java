package com.cg.SpringDemo;

import com.cg.SpringDemo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
    //List<Alien> findByAname(String aname);

    @Query("SELECT a FROM Alien a WHERE a.aname = :aname")
    List<Alien> find(@Param("aname") String aname);

}
