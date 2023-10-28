package dev.lesechko.designpatterns.creational.factory;

public class Program {
    public static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        return switch (specialty.toLowerCase()) {
            case "java" -> new JavaDeveloperFactory();
            case "cpp" -> new CppDeveloperFactory();
            case "php" -> new PhpDeveloperFactory();
            default -> throw new RuntimeException(specialty + " is unknown");
        };
    }

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}
