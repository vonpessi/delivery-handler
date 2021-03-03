package deliveryhandler.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import deliveryhandler.backend.service.PackageService;
import deliveryhandler.backend.data.Package;

import java.util.List;

@RestController
@RequestMapping("/api/package")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping
    public List<Package> findAll(){
        return packageService.findAll();
    }

    @GetMapping("/{id}")
    public Package findById(@PathVariable String id){
        return packageService.findById(id);
    }

    @PostMapping
    public Package create(@RequestBody Package pack){
        return packageService.save(pack);
    }

    @PutMapping("/{id}")
    public Package update(@RequestBody Package pack){
        return packageService.save(pack);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        packageService.deleteById(id);
    }

}
