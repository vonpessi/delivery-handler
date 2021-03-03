package deliveryhandler.backend.repository;

import deliveryhandler.backend.data.Package;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackageRepository extends MongoRepository<Package, String> {}
