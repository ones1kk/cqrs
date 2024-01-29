package io.ones1kk.command.item.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Movie extends Item {

    private String director;
    private String actor;
}
