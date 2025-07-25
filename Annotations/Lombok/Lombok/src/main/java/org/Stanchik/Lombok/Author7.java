package org.Stanchik.Lombok;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author7 {
    @EqualsAndHashCode.Include
    String name;

    @EqualsAndHashCode.Include
    String surname;

    int id;
}
