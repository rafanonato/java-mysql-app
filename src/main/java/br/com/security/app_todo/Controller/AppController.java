package br.com.security.app_todo.Controller;

import br.com.security.app_todo.Model.App;
import br.com.security.app_todo.Repository.AppRepository;
import br.com.security.app_todo.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/app", name = "users")
public class AppController {

    @Autowired
    AppRepository appRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<App> listarTudo(){
        return (List<App>) this.appRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/save")
    public App saveAll(App app){
        return this.appRepository.save(app);
    }



}
