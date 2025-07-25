package org.Stanchik.Java;

public class Author1 {
    private int id;
    private String name;
    private String surname;
    private String birthPlace;

    // @NoArgsConstructor
    public Author1() {}

    // @AllArgsConstructor
    public Author1(int id, String name, String surname, String birthPlace) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
    }

    // @RequiredArgsConstructor
    public Author1(String birthPlace) {
        this.birthPlace = birthPlace;
    }
}
