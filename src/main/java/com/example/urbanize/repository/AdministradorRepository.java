package com.example.urbanize.repository;

import com.example.urbanize.model.Administrador;
import com.example.urbanize.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdministradorRepository {

    public interface UsuarioRepository extends JpaRepository<Administrador, Long> {

        List<Administrador> findByNomeAndAtivo(String nome, Boolean Status);

    }
}