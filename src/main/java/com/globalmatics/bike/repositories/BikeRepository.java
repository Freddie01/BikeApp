package com.globalmatics.bike.repositories;

import com.globalmatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
