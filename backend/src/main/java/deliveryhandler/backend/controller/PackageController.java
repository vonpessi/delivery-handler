package deliveryhandler.backend.controller;

import deliveryhandler.backend.data.DailyPackages;
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
    public List<DailyPackages> findAll(){
        return packageService.findAll();
    }

    @GetMapping("/{id}")
    public DailyPackages findById(@PathVariable String id){
        return packageService.findById(id);
    }

    @PostMapping
    public DailyPackages create(@RequestBody DailyPackages dailyPack){
        return packageService.save(dailyPack);
    }

    @PutMapping("/{id}")
    public DailyPackages update(@RequestBody DailyPackages dailyPack){
        return packageService.save(dailyPack);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        packageService.deleteById(id);
    }

}
