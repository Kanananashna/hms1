package Model;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import java.util.List;

public interface ClientRepository extends JpaExtensionRepository<Client,Long>{


    static List<Client> findAll() {

    }

    static Object findById(Long id) {
    }
}
