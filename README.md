# Dental Bonus Booklet Mapping
A prototype to map the MIO "Zahnärztliches Bonusheft" from FHIR to openEHR.

Setup:
1. Have EHRbase and a database running (Docker images: https://hub.docker.com/u/ehrbase)
2. Upload .opt template to database (via POST call to EHRbase)

Java classes for openEHR entities were created via the openEHR SDK (https://github.com/ehrbase/openEHR_SDK).

## Software Architecture

![prototype_architecture](https://github.com/NiklasSchuster/MIO_openEHR_Mapping/assets/43379461/547416d8-0777-40a2-a3b5-8eb10dac47ae)

## Mapping Prototype Logic

![software](https://github.com/NiklasSchuster/MIO_openEHR_Mapping/assets/43379461/3711092f-6698-4671-b635-38e0390dbe70)
