package com.example.jpademo3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpademo3.pojo.Teams;
@Repository
public interface National extends JpaRepository<Teams, Integer> {

}
