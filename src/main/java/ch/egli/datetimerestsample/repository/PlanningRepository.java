package ch.egli.datetimerestsample.repository;

import ch.egli.datetimerestsample.model.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO: Describe
 *
 * @author Christian Egli
 * @since 9/5/17.
 */
public interface PlanningRepository extends JpaRepository<Planning, Long> {
}
