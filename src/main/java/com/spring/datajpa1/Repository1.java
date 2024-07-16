package com.spring.datajpa1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repository1 extends JpaRepository<Product,Long> {


}
