--
-- Create `shop` database
--

CREATE DATABASE shop
    WITH
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

--
-- Create `emails` table
--

CREATE TABLE emails (
	id_email serial PRIMARY KEY,
	email_address VARCHAR ( 100 ) UNIQUE NOT NULL
);

--
-- Create `promotion` table
--

CREATE TABLE promotion (
	id_promo serial PRIMARY KEY,
	product_name VARCHAR ( 100 ) UNIQUE NOT NULL,
	old_price VARCHAR ( 50 ) NOT NULL,
	new_price VARCHAR ( 100 ) UNIQUE NOT NULL,
    picture VARCHAR ( 512 ) UNIQUE NOT NULL
);

--
-- Insert data into promotion table
--

INSERT INTO promotion (product_name, old_price, new_price, picture)
       VALUES
            ('Hoodie DIABLO', '60.00€', '49.49€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-699004397_2000x.jpg?v=1575933062'),
            ('T-shirt', '40.00€', '27.90€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/t-shirt-rubber-t-shirt-futurxwear-noir-xl-2_2000x.jpg?v=1584427096'),
            ('Sneakers RVX 1500', '70.00€', '37.00€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-916103100_2000x.jpg?v=1575933043'),
            ('Sweat pants STRIPED RÉFLÉCHISSANT 3M', '50.00€', '37.90€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/jogging-striped-reflechissant-3mtm-pantalon-cargo-jogging-futurxwear_2000x.jpg?v=1584426332'),
            ('Short GALACTIC', '60.OO€', '46.90€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/short-galactic-short-futurxwear-noir-s_2000x.jpg?v=1593768260'),
            ('Jacket Denim Mountain', '90.00€', '55.00€', 'https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-799643285_7c89fa7c-d634-4bbb-b54a-76ef44db2fc6_2000x.jpg?v=1575933076')