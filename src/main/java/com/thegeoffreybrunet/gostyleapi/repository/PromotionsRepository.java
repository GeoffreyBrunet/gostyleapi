package com.thegeoffreybrunet.gostyleapi.repository;

import com.thegeoffreybrunet.gostyleapi.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PromotionsRepository extends JpaRepository<Promotion, Integer> {

    //@Query("SELECT taux_promotion, product_name, price, picture FROM promotions INNER JOIN product ON product.id_product = promotions.id_promo WHERE qrcode_promo = qrcodePromo")
    Promotion findByQrcodePromoEquals(String qrcodePromo);

}
