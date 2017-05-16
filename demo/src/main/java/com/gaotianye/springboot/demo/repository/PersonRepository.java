package com.gaotianye.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 比较神奇的时这些方法其实CrudRespositroy/JpaRepository（在低一层次）中其实并没有实现，
 * 并且通过对repository方法的命名还可以实现新的方法
 * @author gaotianye
 *
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
	
}
