package org.Stanchik.Lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class Author1 {
    private int id;
    private String name;
    private String surname;
    private final String birthPlace;
}
