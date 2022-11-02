cd ./add/add-application/
mvn clean install
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=asos/add


cd ../../gateway/gateway-application
mvn clean install
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=asos/gateway
