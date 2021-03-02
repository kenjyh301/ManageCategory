package minh.data.Statistic.Controller;

import minh.data.Statistic.Model.Syn;
import minh.data.Statistic.Repository.SynRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Synthetic")
public class SynController {
    @Autowired
    private SynRepository synRepository;

    @GetMapping("/")
    public List<Syn> getAll(){
        List<Syn> synTable= synRepository.findAll();
        return synTable;
    }

    @GetMapping("/{name}")
    public Syn get(@PathVariable(name="name") String name){
        Syn syn= synRepository.findById(name).get();
        return syn;
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Syn updateRow){
        try{
            Syn syn= synRepository.findById(updateRow.getName()).get();
        }catch(Exception e){
            return false;
        }
        synRepository.save(updateRow);
        return true;
    }

}
