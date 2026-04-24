Quiz Application (Monolithic Architecture)

A simple Quiz Application built using Monolithic Architecture.
This project allows users to create and manage quizzes/questions, fetch quizzes, and submit answers to calculate results.

---

🚀 Features

- ➕ Create Questions

- 📋 View All Questions

- ➕ Create Quiz

- 📋 View Quiz by ID

- 📝 Submit Quiz Answers

- 📊 Get Score / Result

---

🏗️ Architecture

This project follows a Monolithic Architecture, where all modules such as:

- Question Management
- Quiz Management
- Result Evaluation

are built and deployed as a single application.

---

🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs

---

📂 Project Structure

src/main/java/com/example/quizapp
│── controller
│── service
│── dao / repository
│── model

---

⚙️ Installation & Setup

1️⃣ Clone the Repository

git clone https://github.com/aniketShukla1605/QuizApp.git
cd QuizApp

2️⃣ Configure Database

Update "application.properties" in place of:

spring.datasource.url=jdbc:mysql://localhost:3306/questiondb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application

mvn spring-boot:run

Server starts at:

http://localhost:8080

---

📌 API Endpoints

Question APIs

Method| Endpoint| Description
POST| "/question/add"| Add new question
GET| "/question/allQuestions"| Get all questions
GET| "/question/category/{category}"| Get questions by category

---

Quiz APIs

Method| Endpoint| Description
POST| "/quiz/create"| Create a quiz
GET| "/quiz/get/{id}"| Get quiz by ID
POST| "/quiz/submit/{id}"| Submit quiz answers

---

🧪 Example Workflow

1. Add questions to database
2. Create quiz by category
3. Fetch quiz questions
4. Submit answers
5. Get final score

---

📈 Future Improvements

- User Authentication
- Microservice Architecture
- Timer for Quiz
- Leaderboard
- Difficulty Levels
- Admin Dashboard
- Frontend Integration (React / Angular)

---

🤝 Contributing

Contributions are welcome!
Fork the repository and create a pull request.

---

📜 License

This project is open-source and available under the MIT License.

---

👨‍💻 Author

Developed by Aniket Shukla
