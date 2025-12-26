package az.edu.itbrains.agency.repository;

import az.edu.itbrains.agency.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio,Long> {
}
