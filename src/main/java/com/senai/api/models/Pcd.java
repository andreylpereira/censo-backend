package com.senai.api.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.senai.api.enums.Genero;
import com.senai.api.enums.LocalizacaoGeografica;
import com.senai.api.enums.NivelEducacao;
import com.senai.api.enums.RendaMedia;
import com.senai.api.enums.SetorOcupacao;
import com.senai.api.enums.TipoOcupacao;

@Entity
@Table(name = "pcd")
public class Pcd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private Date datacenso;
	
    @ManyToOne
    @JoinColumn(name = "usuario_criador_id")
    private Usuario usuarioCriador;

    @ManyToOne
    @JoinColumn(name = "usuario_editor_id")
    private Usuario usuarioEditor;

    @ManyToOne
    @JoinColumn(name = "bairro_id")
    private Bairro bairro;
	
	public Pcd() {
	}

	public Pcd(int id, String cpfPCD, Date dataNascimento, Genero genero, LocalizacaoGeografica localizacaoGeografica,
			NivelEducacao nivelEducacao, Boolean acessoEducacaoInclusiva, TipoOcupacao tipoOcupacao,
			SetorOcupacao setorOcupacao, RendaMedia rendaMedia, Boolean acessoServicosSaude,
			String usoDispositivosAssistencia, Boolean participacaoComunidade, Boolean envolvimentoOrganizacoesPCD,
			Boolean necessidadeCuidadores, Boolean usoBeneficiosSociais, Boolean experienciasDiscriminacao,
			Boolean tecnologiaAssistiva, Boolean acessaTransportePublico, Date datacenso, Usuario usuarioCriador,
			Usuario usuarioEditor, Bairro bairro) {
		this.id = id;
		this.cpfPCD = cpfPCD;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.localizacaoGeografica = localizacaoGeografica;
		this.nivelEducacao = nivelEducacao;
		this.acessoEducacaoInclusiva = acessoEducacaoInclusiva;
		this.tipoOcupacao = tipoOcupacao;
		this.setorOcupacao = setorOcupacao;
		this.rendaMedia = rendaMedia;
		this.acessoServicosSaude = acessoServicosSaude;
		this.usoDispositivosAssistencia = usoDispositivosAssistencia;
		this.participacaoComunidade = participacaoComunidade;
		this.envolvimentoOrganizacoesPCD = envolvimentoOrganizacoesPCD;
		this.necessidadeCuidadores = necessidadeCuidadores;
		this.usoBeneficiosSociais = usoBeneficiosSociais;
		this.experienciasDiscriminacao = experienciasDiscriminacao;
		this.tecnologiaAssistiva = tecnologiaAssistiva;
		this.acessaTransportePublico = acessaTransportePublico;
		this.datacenso = datacenso;
		this.usuarioCriador = usuarioCriador;
		this.usuarioEditor = usuarioEditor;
		this.bairro = bairro;
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

	public Date getDatacenso() {
		return datacenso;
	}

	public void setDatacenso(Date datacenso) {
		this.datacenso = datacenso;
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
