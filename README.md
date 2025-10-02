# SmartCampus 🎓✨

## Overview 🌟
**SmartCampus** is an enhanced university course registration system designed to improve upon a previous implementation by using **object-oriented principles** like **inheritance** and **polymorphism**. This project adds new features for students, professors, and admins, and even includes a **meal reservation module** for students! 🍽️

---

## Features 🛠️

### 1. Users 👥
- **Admin** 🧑‍💼: Can create, edit, and delete students, professors, courses, and course groups. Can view and approve/reject student course withdrawal requests. ✅❌
- **Student** 👩‍🎓: Can register for courses respecting prerequisites, schedule conflicts, capacity limits, and duplicate course rules. Can view weekly schedules 📅, transcripts 📝, GPA, and send course removal requests to the admin.
- **Professor** 👨‍🏫: Can view courses they teach, enrolled students 👥, weekly schedules 📆, and enter grades for students 🏅.

### 2. Courses & Course Groups 📚
- **Course**: Stores course ID, name, and prerequisites. Methods include validating prerequisites.
- **Course Group**: Stores course ID, enrolled students, schedule (days & times), capacity, professors, term, and student grades. Can be created by course ID or name.
- **Class Types**:
  - **In-person** 🏫: Physical classroom number + capacity constraints.
  - **Online** 💻: Online capacity constraints.
- **Registration Rules**: Checks prerequisites ✅, schedule conflicts ⏰, capacity 🚪, and duplicates ❌.

### 3. Meal Reservation System 🍱
- Students can reserve meals for:
  - **Breakfast** 🌅 (preset packages)
  - **Lunch** 🍲 (main course, salad 🥗, drink 🥤)
- Tracks meal type, selection, time ⏱️, location 📍, and price 💰.
- Uses **inheritance & polymorphism** to process all meal types efficiently.
- **Optional**: Graphical interface (JavaFX) 🎨 for a better experience.

---

## Implementation Details 💻
- **Language**: Java ☕  
- **OOP Concepts**: Inheritance, Polymorphism, Interfaces 🔄  
- **Data Structures**: Lists, HashMaps 📊  
- **Persistence**: Files for course withdrawal requests 🗂️  
- **UI**: Console-based 🖥️; optional graphical interface for meals 🎨  


## Getting Started 🚀

### Prerequisites ⚙️
- Java Development Kit (JDK) 17+ ☕  
- IDE (IntelliJ IDEA, Eclipse, etc.) 🛠️  

### Running the Project ▶️
1. Clone the repository:  
   ```bash
   git clone <repo-link>
