package br.com.security.app_todo.Repository;

import br.com.security.app_todo.Model.App;
import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<App, Long> {
}
