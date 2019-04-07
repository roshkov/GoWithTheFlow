package repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import model.Meassurements;

public interface MeassurementsRepository extends MongoRepository<Meassurements, String>{
	Meassurements findBy_id(ObjectId _Id);
}
