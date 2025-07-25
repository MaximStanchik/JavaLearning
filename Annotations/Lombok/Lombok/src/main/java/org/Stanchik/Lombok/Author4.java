package org.Stanchik.Lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author4 {
    private int id;

    @EqualsAndHashCode.Include
    private String name;

    @EqualsAndHashCode.Include
    private String surname;
}
