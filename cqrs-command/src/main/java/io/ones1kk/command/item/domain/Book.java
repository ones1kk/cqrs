package io.ones1kk.command.item.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Book extends Item {

    private String author;
    private String isbn;
}
