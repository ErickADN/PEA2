package pea2.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pea2.onpe.model.GrupoVotacion;

@Repository
public interface IGrupoVotacion extends JpaRepository<GrupoVotacion, String>{
	
	@Query(value="{call usp_getGrupoVotacion(:id)}",nativeQuery = true)
	GrupoVotacion getGrupoVotacion(String id);
}
