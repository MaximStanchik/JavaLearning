package org.Stanchik.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE) // теперь все поля по умолчанию будут иметь уровень доступа private
public class CatDTO {
    String name;
    int date;
    int age;

}
