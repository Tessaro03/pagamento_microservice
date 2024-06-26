package com.pagamento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pagamento.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{
   
    @Query("SELECT p FROM Pagamento p WHERE p.pedidoId = :idPedido")
    Optional<Pagamento> pagamentoPorIdPedido(Long idPedido);

    
}
