📌 SpringPractice

A simple Spring Boot practice project demonstrating basic RESTful API development, JSON handling, request validation, and working with path variables.
This project is designed as a hands-on exercise to improve foundational Spring Boot skills.

🚀 Features
✔ HomeController

Provides simple endpoints for HTML response and path-based operations.

Method	Endpoint	Description
GET	/Home/index	Returns a simple HTML "Hello World" message
GET	/Home/home	Returns an HTML "Welcome" message
GET	/Home/sum/{number1}/{number2}	Returns the sum of two numbers
✔ JsonController

Demonstrates JSON request/response handling.

Method	Endpoint	Description
GET	/json/{id}/{name}/{lastname}	Returns a JSON object created from path variables
POST	/json	Accepts a JSON body and returns the validated object back
📄 Example JSON Response
GET: /json/1/John/Doe
{
  "id": 1,
  "name": "John",
  "lastname": "Doe"
}

POST: /json

Request:

{
  "id": 10,
  "name": "Kian",
  "lastname": "Almasi"
}


Response:

{
  "id": 10,
  "name": "Kian",
  "lastname": "Almasi"
}

🛠 Technologies Used

Java 17+

Spring Boot

Spring Web

Jakarta Validation

📦 How to Run
mvn spring-boot:run


Or run from your IDE (IntelliJ recommended).

🎯 Purpose of the Project

This project was created for practicing:

Writing clean RESTful APIs

Working with @RestController and @RequestMapping

Using @PathVariable and @RequestBody

Handling JSON in Spring

Understanding basic validation

📁 Project Structure
src/
 └── main/
     └── java/com/practice/springpractice/
         ├── controller/
         │   ├── HomeController.java
         │   └── JsonController.java
         └── response/
             └── Person.java

🤝 Contributing

This is a personal practice project, but contributions, ideas, and improvements are welcome!

📜 License

This project is open-source and free to use.
