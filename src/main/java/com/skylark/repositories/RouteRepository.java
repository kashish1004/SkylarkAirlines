package com.skylark.repositories;
import java.util.Optional;

/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Sterlite technologies Ltd.
 * @description DAO Interface for Route
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Route;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021

 * @copyright Skylark Airline
 */
public interface RouteRepository extends JpaRepository<Route,String> {

	Optional<Route> findByFromCity(String fromCity);

	Optional<Route> findByToCity(String toCity);



}
