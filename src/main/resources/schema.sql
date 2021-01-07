--
-- Create `shop` database
--

--CREATE DATABASE shop
--    WITH
--    ENCODING = 'UTF8'
--    CONNECTION LIMIT = -1;

--
-- Create `emails` table
--

CREATE TABLE emails (
	id_email serial PRIMARY KEY,
	email_address VARCHAR ( 100 ) UNIQUE NOT NULL
);

--
-- Create `product` table
--

CREATE TABLE product (
	id_product serial PRIMARY KEY,
	product_name VARCHAR ( 100 ) NOT NULL,
	price NUMERIC NOT NULL,
    picture VARCHAR ( 512 ) NOT NULL
);

--
-- Create `promotions` table
--

CREATE TABLE promotions (
	id_promo serial PRIMARY KEY,
	taux_promotion NUMERIC NOT NULL,
	qrcode_promo VARCHAR ( 21 ) NOT NULL,
	product_id SMALLINT,
	CONSTRAINT fk_product
      FOREIGN KEY(product_id)
	    REFERENCES product(id_product)
	    ON DELETE CASCADE
);

--
-- Insert data into "product" table
--

INSERT INTO product (product_name, price, picture)
   VALUES
        ('Hoodie DIABLO', 49.49, 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-699004397_2000x.jpg?v=1575933062'),
        ('T-shirt', 27.90, 'https://cdn.shopify.com/s/files/1/1968/6751/products/t-shirt-rubber-t-shirt-futurxwear-noir-xl-2_2000x.jpg?v=1584427096'),
        ('Sneakers RVX 1500', 37.00, 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-916103100_2000x.jpg?v=1575933043'),
        ('Sweat pants STRIPED RÉFLÉCHISSANT 3M', 37.90, 'https://cdn.shopify.com/s/files/1/1968/6751/products/jogging-striped-reflechissant-3mtm-pantalon-cargo-jogging-futurxwear_2000x.jpg?v=1584426332'),
        ('Short GALACTIC', 46.90, 'https://cdn.shopify.com/s/files/1/1968/6751/products/short-galactic-short-futurxwear-noir-s_2000x.jpg?v=1593768260'),
        ('Jacket Denim Mountain', 55.00, 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-799643285_7c89fa7c-d634-4bbb-b54a-76ef44db2fc6_2000x.jpg?v=1575933076')

--
-- Insert data into "promotions" table
--

INSERT INTO promotions (taux_promotion, qrcode_promo, product_id)
    VALUES
        (20, 'mDCwfP5dS5xgtt9Nw4N7', 1),
        (20, 'kbxETDtNTQLMrHUvLOky', 2),
        (20, '0baGA7JqkS5uoJ3LnrVW', 3),
        (20, 'IshlFIr9vC6kJ1mR0bS6', 4),
        (20, '5A7vYjAqazcpVgWJ1T1t', 5),
        (20, 'zGGHYIlQxh0iuyuHIwSY', 6)


