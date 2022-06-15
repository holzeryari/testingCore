package coop.tecso.test.repository;

import coop.tecso.test.entity.FormaPagoMedioPago;
import coop.tecso.test.entity.Plan;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface FormaPagoMedioPagoRepository extends CrudRepository<FormaPagoMedioPago, Long> {

    List<FormaPagoMedioPago> findByFormaPagoPlan(Plan plan);

}
