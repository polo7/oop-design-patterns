package dev.lesechko.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer.");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
            }
            developers.put(specialty, developer);
        }
        String tmp = developers.keySet().stream()
                        .map(key -> key + "=" + developers.get(key))
                        .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(developers.toString());
        return developer;
    }
}
