package io.ones1kk.command.delivery.domain;

import io.ones1kk.command.common.BaseEntity;
import io.ones1kk.command.common.component.Address;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Long id;

    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
