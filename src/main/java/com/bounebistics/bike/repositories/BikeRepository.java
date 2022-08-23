package com.bounebistics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bounebistics.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
