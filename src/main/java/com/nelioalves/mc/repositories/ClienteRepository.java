package com.nelioalves.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nelioalves.mc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
