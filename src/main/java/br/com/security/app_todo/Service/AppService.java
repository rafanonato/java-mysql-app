package br.com.security.app_todo.Service;

import br.com.security.app_todo.Model.App;

import java.util.List;

public interface AppService {

    List<App> listAll();

    App listOfOne(Long id);

    App save(App app);

    int deletar(Long id);

}
