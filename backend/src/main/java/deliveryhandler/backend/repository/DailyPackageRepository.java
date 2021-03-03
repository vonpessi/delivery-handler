package deliveryhandler.backend.repository;

import deliveryhandler.backend.data.DailyPackages;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DailyPackageRepository extends MongoRepository<DailyPackages, String> {}
