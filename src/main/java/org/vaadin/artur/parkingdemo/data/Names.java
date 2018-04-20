package org.vaadin.artur.parkingdemo.data;

import java.util.Random;

public class Names {

    private Random random = new Random();

    public String getRandomFirstName() {
        return firstNames[random.nextInt(firstNames.length)];
    }

    public String getRandomLastName() {
        return lastNames[random.nextInt(lastNames.length)];
    }

    String[] firstNames = { "Noah", "Liam", "Mason", "Jacob", "William",
            "Ethan", "Michael", "Alexander", "James", "Daniel", "Elijah",
            "Benjamin", "Logan", "Aiden", "Jayden", "Matthew", "Jackson",
            "David", "Lucas", "Joseph", "Anthony", "Andrew", "Samuel",
            "Gabriel", "Joshua", "John", "Carter", "Luke", "Dylan",
            "Christopher", "Isaac", "Oliver", "Henry", "Sebastian", "Caleb",
            "Owen", "Ryan", "Nathan", "Wyatt", "Hunter", "Jack", "Christian",
            "Landon", "Jonathan", "Levi", "Jaxon", "Julian", "Isaiah", "Eli",
            "Aaron", "Charles", "Connor", "Cameron", "Thomas", "Jordan",
            "Jeremiah", "Nicholas", "Evan", "Adrian", "Gavin", "Robert",
            "Brayden", "Grayson", "Josiah", "Colton", "Austin", "Angel", "Jace",
            "Dominic", "Kevin", "Brandon", "Tyler", "Parker", "Ayden", "Jason",
            "Jose", "Ian", "Chase", "Adam", "Hudson", "Nolan", "Zachary",
            "Easton", "Blake", "Jaxson", "Cooper", "Lincoln", "Xavier",
            "Bentley", "Kayden", "Carson", "Brody", "Asher", "Nathaniel",
            "Ryder", "Justin", "Leo", "Juan", "Luis", "Camden", "Tristan",
            "Emma", "Olivia", "Sophia", "Isabella", "Ava", "Mia", "Emily",
            "Abigail", "Madison", "Charlotte", "Harper", "Sofia", "Avery",
            "Elizabeth", "Amelia", "Evelyn", "Ella", "Chloe", "Victoria",
            "Aubrey", "Grace", "Zoey", "Natalie", "Addison", "Lillian",
            "Brooklyn", "Lily", "Hannah", "Layla", "Scarlett", "Aria", "Zoe",
            "Samantha", "Anna", "Leah", "Audrey", "Ariana", "Allison",
            "Savannah", "Arianna", "Camila", "Penelope", "Gabriella", "Claire",
            "Aaliyah", "Sadie", "Riley", "Skylar", "Nora", "Sarah", "Hailey",
            "Kaylee", "Paisley", "Kennedy", "Ellie", "Peyton", "Annabelle",
            "Caroline", "Madelyn", "Serenity", "Aubree", "Lucy", "Alexa",
            "Alexis", "Nevaeh", "Stella", "Violet", "Genesis", "Mackenzie",
            "Bella", "Autumn", "Mila", "Kylie", "Maya", "Piper", "Alyssa",
            "Taylor", "Eleanor", "Melanie", "Naomi", "Faith", "Eva",
            "Katherine", "Lydia", "Brianna", "Julia", "Ashley", "Khloe",
            "Madeline", "Ruby", "Sophie", "Alexandra", "London", "Lauren",
            "Gianna", "Isabelle", "Alice", "Vivian", "Hadley", "Jasmine" };

    String[] lastNames = { "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez",
            "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin",
            "Jackson", "Thompson", "White", "Lopez", "Lee", "Gonzalez",
            "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez", "Hall",
            "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green",
            "Baker", "Adams", "Nelson", "Hill", "Ramirez", "Campbell",
            "Mitchell", "Roberts", "Carter", "Phillips", "Evans", "Turner",
            "Torres", "Parker", "Collins", "Edwards", "Stewart", "Flores",
            "Morris", "Nguyen", "Murphy", "Rivera", "Cook", "Rogers", "Morgan",
            "Peterson", "Cooper", "Reed", "Bailey", "Bell", "Gomez", "Kelly",
            "Howard", "Ward", "Cox", "Diaz", "Richardson", "Wood", "Watson",
            "Brooks", "Bennett", "Gray", "James", "Reyes", "Cruz", "Hughes",
            "Price", "Myers", "Long", "Foster", "Sanders", "Ross", "Morales",
            "Powell", "Sullivan", "Russell", "Ortiz", "Jenkins", "Gutierrez",
            "Perry", "Butler", "Barnes", "Fisher" };

}