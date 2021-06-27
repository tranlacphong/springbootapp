1. Change your codes
2. Build app: ./gradlew clean build
3. Change Dockerfile if needed
4. Build springbootapp image: docker build ./ -t springbootapp
5. Change docker-compose.yml if needed
6. Run containers: docker-compose up

*** API ***
- GET ALL: http://localhost:8080/api/v1/students
- GET ONE: http://localhost:8080/api/v1/students/2
- PUT: http://localhost:8080/api/v1/students/2 {"name": "ABC", "dob": "12/11/1992"}
- POST: http://localhost:8080/api/v1/students {"name": "ABC", "dob": "12/11/1992"}
- DELETE: http://localhost:8080/api/v1/students/2
 
