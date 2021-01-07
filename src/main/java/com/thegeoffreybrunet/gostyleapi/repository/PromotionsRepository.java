package com.thegeoffreybrunet.gostyleapi.repository;

import com.thegeoffreybrunet.gostyleapi.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionsRepository extends JpaRepository<Promotion, Integer> {

    //@Query("SELECT p.tauxPromotion FROM Promotion AS p INNER JOIN Product AS pr ON pr.idProduct = p.idPromo WHERE p.qrcodePromo = :qrcodeAcquired")
    Promotion findByQrcodePromoEquals(String qrcodeAcquired);

}
