package com.wsi.print.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "collates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Collates {

    @Id
    @Column(name = "collate_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collate_id;

    @Column(name = "tc_lpn_id")
    private String tc_lpn_id;

    @Column(name = "png")
    private String png;

    @Column(name = "status")
    private boolean status;

}
