package pea2.onpe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pea2.onpe.model.GrupoVotacion;
import pea2.onpe.repository.IGrupoVotacion;

@Service
public class GrupoVotacionServiceImp implements IGrupoVotacionService{
	@Autowired
	IGrupoVotacion iGrupoVotacion;
	

	@Override
	public GrupoVotacion getGrupoVotacion(String id) {
		return iGrupoVotacion.getGrupoVotacion(id);
	}
}
