package memelandia.memecategory.repositories;

import memelandia.memecategory.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, String> {
}
