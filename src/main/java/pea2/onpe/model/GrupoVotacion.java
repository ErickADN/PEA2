package pea2.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrupoVotacion {
	
	@Id
	
	private String idGrupoVotacion;
	private String Departamento;
	private String Provincia;
	private String Distrito;
	private String RazonSocial;
	private String Direccion;
	private int idLocalVotacion;
	private int nCopia;
	private int idEstadoActa;
	private int ElectoresHabiles;
	private int TotalVotantes;
	private int P1;
	private int P2;
	private int VotosBlancos;
	private int VotosNulos;
	private int VotosImpugnados;
	public String getIdGrupoVotacion() {
		return idGrupoVotacion;
	}
	public void setIdGrupoVotacion(String idGrupoVotacion) {
		this.idGrupoVotacion = idGrupoVotacion;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getIdLocalVotacion() {
		return idLocalVotacion;
	}
	public void setIdLocalVotacion(int idLocalVotacion) {
		this.idLocalVotacion = idLocalVotacion;
	}
	public int getnCopia() {
		return nCopia;
	}
	public void setnCopia(int nCopia) {
		this.nCopia = nCopia;
	}
	public int getIdEstadoActa() {
		return idEstadoActa;
	}
	public void setIdEstadoActa(int idEstadoActa) {
		this.idEstadoActa = idEstadoActa;
	}
	public int getElectoresHabiles() {
		return ElectoresHabiles;
	}
	public void setElectoresHabiles(int electoresHabiles) {
		ElectoresHabiles = electoresHabiles;
	}
	public int getTotalVotantes() {
		return TotalVotantes;
	}
	public void setTotalVotantes(int totalVotantes) {
		TotalVotantes = totalVotantes;
	}
	public int getP1() {
		return P1;
	}
	public void setP1(int p1) {
		P1 = p1;
	}
	public int getP2() {
		return P2;
	}
	public void setP2(int p2) {
		P2 = p2;
	}
	public int getVotosBlancos() {
		return VotosBlancos;
	}
	public void setVotosBlancos(int votosBlancos) {
		VotosBlancos = votosBlancos;
	}
	public int getVotosNulos() {
		return VotosNulos;
	}
	public void setVotosNulos(int votosNulos) {
		VotosNulos = votosNulos;
	}
	public int getVotosImpugnados() {
		return VotosImpugnados;
	}
	public void setVotosImpugnados(int votosImpugnados) {
		VotosImpugnados = votosImpugnados;
	}
	
	
	
}
