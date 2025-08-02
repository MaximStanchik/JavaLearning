package org.Stanchik.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Getter
@Setter
@Document(collection = "dogs")
public class Dog {
    @Id
    private UUID id;

    @Indexed(unique=true)
    @Field("name")
    private String name;

    @Field("age")
    private Integer age;
}
