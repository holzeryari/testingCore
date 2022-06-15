package coop.tecso.test.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

@Table(name = "for_formapago")
public class FormaPago{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    Long version;

    @Column(name = "cantidadcuotas")
    Integer cantidadCuotas;

    @Column(name="preciocuota")
    BigDecimal precioCuota;

    @Column(name = "codigoisomoneda")
    Currency codigoISOMoneda;

    @Column(name = "fechadesde")
    LocalDate fechaDesde;

    @Column(name = "fechahasta")
    LocalDate fechaHasta;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idplan")
    Plan plan;

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(BigDecimal precioCuota) {
        this.precioCuota = precioCuota;
    }

    public Currency getCodigoISOMoneda() {
        return codigoISOMoneda;
    }

    public void setCodigoISOMoneda(Currency codigoISOMoneda) {
        this.codigoISOMoneda = codigoISOMoneda;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
