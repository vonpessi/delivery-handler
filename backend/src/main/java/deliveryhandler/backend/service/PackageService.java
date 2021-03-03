package deliveryhandler.backend.service;

import deliveryhandler.backend.data.Package;
import deliveryhandler.backend.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import deliveryhandler.backend.repository.PackageRepository;

import java.util.List;

@Service
public class PackageService {

    @Autowired
    private PackageRepository packageRepository;

    public List<Package> findAll(){
        return packageRepository.findAll();
    }

    public Package findById(String id){
        return packageRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Package save(Package pack){
        return packageRepository.save(pack);
    }

    public void deleteById(String id){
        packageRepository.deleteById(id);
    }

}
