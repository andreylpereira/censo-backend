package com.senai.api.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.senai.api.enums.Genero;
import com.senai.api.enums.LocalizacaoGeografica;
import com.senai.api.enums.NivelEducacao;
import com.senai.api.enums.RendaMedia;
import com.senai.api.enums.SetorOcupacao;
import com.senai.api.enums.TipoOcupacao;
import com.senai.api.models.Bairro;
import com.senai.api.models.Usuario;

public class PcdDto {

	private int id;
	private String cpfPCD;
	private Date dataNascimento;
	@Enumerated(EnumType.STRING)
	private Genero genero;
	@Enumerated(EnumType.STRING)
	private LocalizacaoGeografica localizacaoGeografica;
	@Enumerated(EnumType.STRING)
	private NivelEducacao nivelEducacao;
	private Boolean acessoEducacaoInclusiva;
	@Enumerated(EnumType.STRING)
	private TipoOcupacao tipoOcupacao;
	@Enumerated(EnumType.STRING)
	private SetorOcupacao setorOcupacao;
	@Enumerated(EnumType.STRING)
	private RendaMedia rendaMedia;
	private Boolean acessoServicosSaude;
	private String usoDispositivosAssistencia;
	private Boolean participacaoComunidade;
	private Boolean envolvimentoOrganizacoesPCD;
	private Boolean necessidadeCuidadores;
	private Boolean usoBeneficiosSociais;
	private Boolean experienciasDiscriminacao;
	private Boolean tecnologiaAssistiva;
	private Boolean acessaTransportePublico;
	private Boolean ativo;
	private LocalDateTime criacaoCenso;
	private LocalDateTime edicaoCenso;
	private Usuario usuarioCriador;
	private Usuario usuarioEditor;
	private Bairro bairro;
	
	public PcdDto() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpfPCD() {
		return cpfPCD;
	}
	public void setCpfPCD(String cpfPCD) {
		this.cpfPCD = cpfPCD;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public LocalizacaoGeografica getLocalizacaoGeografica() {
		return localizacaoGeografica;
	}
	public void setLocalizacaoGeografica(LocalizacaoGeografica localizacaoGeografica) {
		this.localizacaoGeografica = localizacaoGeografica;
	}
	public NivelEducacao getNivelEducacao() {
		return nivelEducacao;
	}
	public void setNivelEducacao(NivelEducacao nivelEducacao) {
		this.nivelEducacao = nivelEducacao;
	}
	public Boolean getAcessoEducacaoInclusiva() {
		return acessoEducacaoInclusiva;
	}
	public void setAcessoEducacaoInclusiva(Boolean acessoEducacaoInclusiva) {
		this.acessoEducacaoInclusiva = acessoEducacaoInclusiva;
	}
	public TipoOcupacao getTipoOcupacao() {
		return tipoOcupacao;
	}
	public void setTipoOcupacao(TipoOcupacao tipoOcupacao) {
		this.tipoOcupacao = tipoOcupacao;
	}
	public SetorOcupacao getSetorOcupacao() {
		return setorOcupacao;
	}
	public void setSetorOcupacao(SetorOcupacao setorOcupacao) {
		this.setorOcupacao = setorOcupacao;
	}
	public RendaMedia getRendaMedia() {
		return rendaMedia;
	}
	public void setRendaMedia(RendaMedia rendaMedia) {
		this.rendaMedia = rendaMedia;
	}
	public Boolean getAcessoServicosSaude() {
		return acessoServicosSaude;
	}
	public void setAcessoServicosSaude(Boolean acessoServicosSaude) {
		this.acessoServicosSaude = acessoServicosSaude;
	}
	public String getUsoDispositivosAssistencia() {
		return usoDispositivosAssistencia;
	}
	public void setUsoDispositivosAssistencia(String usoDispositivosAssistencia) {
		this.usoDispositivosAssistencia = usoDispositivosAssistencia;
	}
	public Boolean getParticipacaoComunidade() {
		return participacaoComunidade;
	}
	public void setParticipacaoComunidade(Boolean participacaoComunidade) {
		this.participacaoComunidade = participacaoComunidade;
	}
	public Boolean getEnvolvimentoOrganizacoesPCD() {
		return envolvimentoOrganizacoesPCD;
	}
	public void setEnvolvimentoOrganizacoesPCD(Boolean envolvimentoOrganizacoesPCD) {
		this.envolvimentoOrganizacoesPCD = envolvimentoOrganizacoesPCD;
	}
	public Boolean getNecessidadeCuidadores() {
		return necessidadeCuidadores;
	}
	public void setNecessidadeCuidadores(Boolean necessidadeCuidadores) {
		this.necessidadeCuidadores = necessidadeCuidadores;
	}
	public Boolean getUsoBeneficiosSociais() {
		return usoBeneficiosSociais;
	}
	public void setUsoBeneficiosSociais(Boolean usoBeneficiosSociais) {
		this.usoBeneficiosSociais = usoBeneficiosSociais;
	}
	public Boolean getExperienciasDiscriminacao() {
		return experienciasDiscriminacao;
	}
	public void setExperienciasDiscriminacao(Boolean experienciasDiscriminacao) {
		this.experienciasDiscriminacao = experienciasDiscriminacao;
	}
	public Boolean getTecnologiaAssistiva() {
		return tecnologiaAssistiva;
	}
	public void setTecnologiaAssistiva(Boolean tecnologiaAssistiva) {
		this.tecnologiaAssistiva = tecnologiaAssistiva;
	}
	public Boolean getAcessaTransportePublico() {
		return acessaTransportePublico;
	}
	public void setAcessaTransportePublico(Boolean acessaTransportePublico) {
		this.acessaTransportePublico = acessaTransportePublico;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDateTime getCriacaoCenso() {
		return criacaoCenso;
	}
	public void setCriacaoCenso(LocalDateTime criacaoCenso) {
		this.criacaoCenso = criacaoCenso;
	}
	public LocalDateTime getEdicaoCenso() {
		return edicaoCenso;
	}
	public void setEdicaoCenso(LocalDateTime edicaoCenso) {
		this.edicaoCenso = edicaoCenso;
	}
	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}
	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}
	public Usuario getUsuarioEditor() {
		return usuarioEditor;
	}
	public void setUsuarioEditor(Usuario usuarioEditor) {
		this.usuarioEditor = usuarioEditor;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

}
