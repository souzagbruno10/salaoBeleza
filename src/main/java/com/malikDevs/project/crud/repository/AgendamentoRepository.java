package com.malikDevs.project.crud.repository;

import com.malikDevs.project.crud.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository <Agendamento, Long> {
}
