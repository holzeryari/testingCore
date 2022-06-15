package coop.tecso.test.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Table(name = "for_plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    Long version;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "informacionadicional")
    private String informacionAdicional;

    @Column(name = "linkcondiciones")
    private String linkCondiciones;

    @Column(name = "minimacantidadobjetos")
    private Integer minimaCantidadObjetos;

    @Column(name = "maximacantidadobjetos")
    private Integer maximaCantidadObjetos;

    @Column(name = "habilitado")
    private boolean habilitado;

    @Column(name = "plangenerico")
    private boolean planGenerico;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public String getLinkCondiciones() {
        return linkCondiciones;
    }

    public void setLinkCondiciones(String linkCondiciones) {
        this.linkCondiciones = linkCondiciones;
    }

    public Integer getMinimaCantidadObjetos() {
        return minimaCantidadObjetos;
    }

    public void setMinimaCantidadObjetos(Integer minimaCantidadObjetos) {
        this.minimaCantidadObjetos = minimaCantidadObjetos;
    }

    public Integer getMaximaCantidadObjetos() {
        return maximaCantidadObjetos;
    }

    public void setMaximaCantidadObjetos(Integer maximaCantidadObjetos) {
        this.maximaCantidadObjetos = maximaCantidadObjetos;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isPlanGenerico() {
        return planGenerico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setPlanGenerico(boolean planGenerico) {
        this.planGenerico = planGenerico;
    }
}
