package io.ones1kk.command.item.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Album extends Item {

    private String artist;
    private String etc;
}
