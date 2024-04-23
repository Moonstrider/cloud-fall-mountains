package com.cloudfall.mountains.notebook.entity.cassandra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Table("student")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @PrimaryKey
    private int id;

    @Column(value = "name")
    private String name;

    @Column(value = "age")
    private int age;

    @Column(value = "gender")
    private int gender;

    @Column(value = "address")
    private String address;

    @Column(value = "interest")
    private Set<String> interest;

    @Column(value = "phone")
    private List<String> phone;

    @Column(value = "education")
    private Map<String, String> education;
}