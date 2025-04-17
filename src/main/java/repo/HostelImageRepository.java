package repo;

import entity.HostelImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelImageRepository extends JpaRepository<HostelImage, Long> {

}