package deliveryhandler.backend.service;

import deliveryhandler.backend.data.DailyPackages;
import deliveryhandler.backend.exception.EntityNotFoundException;
import deliveryhandler.backend.repository.DailyPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {

    @Autowired
    private DailyPackageRepository dailyPackageRepository;

    public List<DailyPackages> findAll(){
        return dailyPackageRepository.findAll();
    }

    public DailyPackages findById(String id){
        return dailyPackageRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public DailyPackages save(DailyPackages pack){
        return dailyPackageRepository.save(pack);
    }

    public void deleteById(String id){
        dailyPackageRepository.deleteById(id);
    }

}
