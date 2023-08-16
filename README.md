# Dental Bonus Booklet Mapping
A prototype to map the MIO "Zahnärztliches Bonusheft" from FHIR to openEHR.

Setup:
1. Have EHRbase and a database running (Docker images: https://hub.docker.com/u/ehrbase)
2. Upload .opt template to database (via POST call to EHRbase)

Java classes for openEHR entities were created via the openEHR SDK (https://github.com/ehrbase/openEHR_SDK).
