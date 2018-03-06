package br.com.security.app_todo.Service.ServiceImp;

import br.com.security.app_todo.Model.App;
import br.com.security.app_todo.Repository.AppRepository;
import br.com.security.app_todo.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppImp implements AppService {

    @Autowired
    AppRepository appRepository;

    @Override
    public List<App> listAll() {
        return (List<App>) this.appRepository.findAll();
    }

    @Override
    public App listOfOne(Long id) {
        return this.appRepository.findOne(id);
    }

    @Override
    public App save(App app) {
        return this.appRepository.save(app);
    }


    @Override
    public int deletar(Long id) {
         this.appRepository.delete(id);
        return 0;
    }
}
