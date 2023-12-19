# course_microservice_task1
## Task1
In this module you will need to create base structure of microservices system.
During this task you need to implement the next two services:

Resource Service
Song Service

For a Resource Service, it is recommended to implement a service with CRUD operations for processing mp3 files.
Service definition could be next: ... 

When uploading a mp3 file, the Resource Service should process the file in this way:

Extract file metadata. An external library can be used for this purpose.(e.g. Apache Tika).
Store mp3 file to the underlying database of the service as Blob.
Invoke Song Service to save mp3 file metadata.

For the Song Service, it is recommended to implement a simple CRUD service to manage the song record (metadata).
The service should provide the ability to manage some metadata about the songs (artist, album, etc.).
Make sure the service is still available over HTTP.
Service definition could be next: ...

## Task1_Solution
The project consists of two module: for resource and song applications.
compose.yml sets up two Postgresql DB containers for each service.
/resources directory contains an example of an MP3 file.

Test cases:
1. Create a Resource:
![images/img_0.png](images/img_0.png)
2. Get the Resource by id:
![images/img_1.png](images/img_1.png)
3. Delete the Resource by id:
![images/img_2.png](images/img_2.png)
4. Metadata:
![images/img_3.png](images/img_3.png)
Same, database view:
![images/img_4.png](images/img_4.png)

An example of an integration test is included as well.