package Entity;

import java.util.Date;

public class Leito 
{
	private String data; /* Data no formato YYYY-MM-DD */
	private String nomedistrito; /* DRS ou região da Grande São Paulo */
	private int totalcovidleito; /* Total de Leitos de UTI Destinados para COVID-19 no dia */
	private int populacao;/* População da DRS ou região da Grande São Paulo (Fonte: SEADE) */
	private double leitospc;/* Leitos Covid-19 UTI por 100 mil habitantes (total_covid_uti / pop) */
	private int internacoes7d;/* Número de novas internações de pacientes confirmados ou com suspeita de COVID-19 nos últimos 7 dias */
	private int internacoes7di;/* Número de novas internações de pacientes confirmados ou com suspeita de COVID-19 nos 7 dias anteriores */
	private double internacoes7v7;/* Variação no número de novas internações ((internacoes_7d - internacoes_7d_l) / internacoes_7d_l) */
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
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

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getLeitospc() {
		return leitospc;
	}

	public void setLeitospc(double leitospc) {
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

	public double getInternacoes7v7() {
		return internacoes7v7;
	}

	public void setInternacoes7v7(double internacoes7v7) {
		this.internacoes7v7 = internacoes7v7;
	}

	/* Comparando nomes de String retorna boolean */
	public int compareTo(Leito l) 
	{
		return this.getNomedistrito().compareTo(l.getNomedistrito());
	}
	
	@Override
	public String toString() 
	{
		return nomedistrito;
	}
}
