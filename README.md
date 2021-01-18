# GoStyleAPI

## Project management
Kanban of project is [here](https://trello.com/b/IgDLHkwY/mspr1).  

## Infrastructure
Backend & database are "" on [Heroku](https://www.heroku.com/home).  
A list and description of APIs can be found at this [URL](https://app.swaggerhub.com/apis/GeoffreyBrunet/GoStyle/1.0.0).
https://gostyleapi.herokuapp.com/api/email
https://gostyleapi.herokuapp.com/api/promotions

## Backend
I have used the java framework [Spring](https://spring.io/) for the backend.  

## Database
[PostgreSQL](https://www.postgresql.org/)
ID: postgres  
Password: SCvQdXQyg0MiA9g94QSR  
Address: db-gostyle.chsjhycvg25z.eu-west-3.rds.amazonaws.com  

https://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate  

https://www.baeldung.com/sonar-qube  

SELECT taux_promotion, product_name, price, picture
FROM promotions
INNER JOIN product
	ON product.id_product = promotions.id_promo
WHERE qrcode_promo = 'mDCwfP5dS5xgtt9Nw4N7'  

https://github.com/marketplace/actions/beanstalk-deploy  

https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-one-mapping-example/  