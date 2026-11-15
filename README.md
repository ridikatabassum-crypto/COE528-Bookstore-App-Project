# Bookstore Management System (COE528)

A Java-based desktop bookstore application built using Object-Oriented Analysis and Design principles, featuring a single-window graphical user interface (GUI), persistent file storage, and the State Design Pattern[cite: 1, 4, 6].

---

## Key Features

* **Role-Based Authentication:** Supports two distinct user types—an Owner (`admin`/`admin`) and multiple Customers—with secure login validation[cite: 4].
* **Single-Window GUI Architecture:** Dynamic screen navigation that replaces views (Login, Owner View, Customer View) within a single window rather than opening multiple dialogs[cite: 4].
* **State Design Pattern:** Manages customer membership tiers (`SilverState` for < 1,000 points, `GoldState` for ≥ 1,000 points) dynamically to calculate point redemptions ($1 discount per 100 points) and loyalty rewards (10 points per $1 spent)[cite: 2, 3, 6].
* **Data Persistence:** Reads inventory and customer records from text files (`Books.txt` and `Customers.txt`) on startup and overwrites them upon application exit to maintain accurate records[cite: 4].
* **Comprehensive Error Handling:** Validates user inputs, handles missing file errors, prevents negative final pricing, and restricts invalid login details[cite: 3, 5].

---

## Technical Stack & Concepts
* **Language:** Java
* **Design Patterns:** State Design Pattern, Object-Oriented Programming (Encapsulation, Inheritance, Modularity)[cite: 4, 5, 6]
* **UI Framework:** Java GUI / Swing components
* **Data Storage:** Flat-file persistence (`Books.txt`, `Customers.txt`)[cite: 4]

---

## How to Run
1. Clone or download the repository to your local machine.
2. Open the project in your preferred Java IDE (such as NetBeans).
3. Ensure that the data files (`Books.txt` and `Customers.txt`) are present in the root directory for proper data loading[cite: 4].
4. Run the main application class to launch the single-window login interface[cite: 4].
