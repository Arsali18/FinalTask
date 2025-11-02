🧪 Selenium Cucumber Automation Project

Proyek ini adalah automated test berbasis Selenium WebDriver, Cucumber (BDD), dan TestNG untuk melakukan simulasi pemesanan tiket penerbangan di Agoda.com
.

📁 Struktur Proyek
SeleniumJava/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Page/
│   │           ├── DashboardPage.java
│   │           └── FlightResultPage.java
│   └── test/
│       └── java/
│           ├── stepdefinition/
│           │   └── StepImpl.java
│           └── features/
│               └── booking_ticket.feature
└── README.md

⚙️ Teknologi yang Digunakan
Komponen	Versi	Keterangan
Java	17	Bahasa pemrograman utama
Selenium Java	4.35.0	Untuk automation browser
Cucumber Java	7.31.0	Framework BDD
Cucumber TestNG	7.31.0	Integrasi Cucumber dengan TestNG
TestNG	7.11.0	Test runner
Maven	3.x	Build automation dan dependency management
🚀 Cara Menjalankan Proyek
1️⃣ Clone Repository
git clone https://github.com/Arsali18/FinalTask
cd SeleniumJava

2️⃣ Pastikan Sudah Install

Java 17

Apache Maven

Google Chrome

ChromeDriver sesuai versi Chrome kamu (bisa letakkan di PATH atau src/test/resources)

3️⃣ Jalankan Tes dengan Maven
mvn test


Atau jika kamu ingin menjalankan menggunakan runner tertentu:

mvn clean test -Dcucumber.filter.tags="@SmokeTest"

🧩 Feature File (Gherkin)

Contoh feature file: booking_ticket.feature

Feature: Booking Ticket Scenario

Scenario: User can book a ticket successfully
Given user is on the dashboard page
When user set departure airport
And user select departure airport
And user set destination airport
And user select destination airport
And user sets departure date
And user click button Search
Then user navigate is navigated to result page
When user select ticket
Then user navigate is navigated to customer information page

🧠 Step Definition

Semua step diimplementasikan dalam file:

src/test/java/stepdefinition/StepImpl.java


🧱 Page Object Model (POM)

Struktur halaman didefinisikan pada package:

src/main/java/Page/

🧾 Dependency Maven (pom.xml)

Sudah termasuk dependency penting:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.35.0</version>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.31.0</version>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>7.31.0</version>
    </dependency>

    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-picocontainer</artifactId>
        <version>7.31.0</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.11.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

👤 Author

Nama: [Arsali]
Email: [92elarsali@gmail.com]
Deskripsi: Automation Engineer yang fokus pada implementasi BDD dengan Selenium dan Cucumber.