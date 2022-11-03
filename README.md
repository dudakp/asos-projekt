Repozitár s konfiguračnými properties pre Consul: https://github.com/smooff/asos-consul-properties

## Spustenie
Pre spustene je nutné mať nainštalovaný docker, docker-compose, Java 17 a Maven (pre WIN, linux script používa mvnw).

### Windows
Spustiť script build-image.ps1 - vytvorenie docker images
### Linux
Spusťiť script build-images.sh - vytvorenie docker images

Po vytvorení images spustiť príkaz  ```docker-compose up``` na roote projektu.
