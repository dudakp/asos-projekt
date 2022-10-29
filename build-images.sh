#!/bin/bash
set -e


echo "building add application image"
cd ./add/add-application/
./mvnw clean install
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=asos/add
echo "Built asos/gateway image"


echo "building add application image"
cd ../../gateway/gateway-application
./mvnw clean install
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=asos/gateway
echo "Built asos/gateway image"
