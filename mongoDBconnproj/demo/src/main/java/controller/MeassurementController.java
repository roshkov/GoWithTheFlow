package controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Meassurements;
import repositories.MeassurementsRepository;

import javax.validation.Valid;
import java.util.List;

//Tells spring that this class will be requested by URL.
@RestController
// Specifies the base URL.
@RequestMapping("/measurements")
public class MeassurementController {
	// Creates an instance
	@Autowired
	private MeassurementsRepository repository;

	// Get All Measurement
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Meassurements> getAllMeasurements() {
		return repository.findAll();
	}

	// Get Measurement by id
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Meassurements addNewMeasurement(@Valid @RequestBody Meassurements measurement) {
		measurement.set_id(ObjectId.get());
		repository.save(measurement);
		return measurement;
	}

}