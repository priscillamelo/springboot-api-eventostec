package ufrn.eaj.tads.springbootapieventostec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.eaj.tads.springbootapieventostec.domain.events.Event;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
