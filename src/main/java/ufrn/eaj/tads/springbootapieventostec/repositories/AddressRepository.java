package ufrn.eaj.tads.springbootapieventostec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.eaj.tads.springbootapieventostec.domain.address.Address;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
