package br.com.nt.parkingcontrol.service;

import br.com.nt.parkingcontrol.model.ParkingSpotModel;
import br.com.nt.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;
   @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    public boolean existsByLicensePlateCar(String licencePlateCar){
       return parkingSpotRepository.existsByLicensePlateCar(licencePlateCar);
    }
    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
       return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }
    public List<ParkingSpotModel> findAll(){
       return parkingSpotRepository.findAll();
    }
}
