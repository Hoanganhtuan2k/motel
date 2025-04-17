package repo;

import entity.SearchLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SearchLogRepository extends JpaRepository<SearchLog, Long> {
    Optional<SearchLog> findByLatitudeAndLongitude(Double latitude, Double longitude);
}