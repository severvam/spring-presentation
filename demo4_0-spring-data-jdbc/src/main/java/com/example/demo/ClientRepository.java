package com.example.demo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends CrudRepository<Client, Long>, WithInsert<Client>  {

    List<Client> findClientByEmailContains(String email);

    @Query("select * from client where user_id like :userId")
    List<Client> findClientsByUserId(@Param("userId") String userId);

}
