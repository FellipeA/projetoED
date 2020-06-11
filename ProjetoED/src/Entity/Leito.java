package Entity;

import java.util.Date;

public class Leito 
{
	private Date data; /* Data no formato YYYY-MM-DD */
	private String nomedistrito; /* DRS ou regi�o da Grande S�o Paulo */
	private int totalcovidleito; /* Total de Leitos de UTI Destinados para COVID-19 no dia */
	private Long populacao;/* Popula��o da DRS ou regi�o da Grande S�o Paulo (Fonte: SEADE) */
	private Double leitospc;/* Leitos Covid-19 UTI por 100 mil habitantes (total_covid_uti / pop) */
	private int internacoes7d;/* N�mero de novas interna��es de pacientes confirmados ou com suspeita de COVID-19 nos �ltimos 7 dias */
	private int internacoes7di;/* N�mero de novas interna��es de pacientes confirmados ou com suspeita de COVID-19 nos 7 dias anteriores */
	private Double internacoes7v7;/* Varia��o no n�mero de novas interna��es ((internacoes_7d - internacoes_7d_l) / internacoes_7d_l) */
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNomedistrito() {
		return nomedistrito;
	}
	public void setNomedistrito(String nomedistrito) {
		this.nomedistrito = nomedistrito;
	}
	public int getTotalcovidleito() {
		return totalcovidleito;
	}
	public void setTotalcovidleito(int totalcovidleito) {
		this.totalcovidleito = totalcovidleito;
	}
	public Long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}
	public Double getLeitospc() {
		return leitospc;
	}
	public void setLeitospc(Double leitospc) {
		this.leitospc = leitospc;
	}
	public int getInternacoes7d() {
		return internacoes7d;
	}
	public void setInternacoes7d(int internacoes7d) {
		this.internacoes7d = internacoes7d;
	}
	public int getInternacoes7di() {
		return internacoes7di;
	}
	public void setInternacoes7di(int internacoes7di) {
		this.internacoes7di = internacoes7di;
	}
	public Double getInternacoes7v7() {
		return internacoes7v7;
	}
	public void setInternacoes7v7(Double internacoes7v7) {
		this.internacoes7v7 = internacoes7v7;
	}	
}
