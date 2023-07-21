package com.example.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToMany.entity.Library;

public interface LibraryRepo extends JpaRepository<Library, Integer>
{

}
