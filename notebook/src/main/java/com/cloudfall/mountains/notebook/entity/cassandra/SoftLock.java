package com.cloudfall.mountains.notebook.entity.cassandra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("softlock")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class SoftLock {

    @PrimaryKeyColumn(name = "uniquekey", type = PrimaryKeyType.PARTITIONED)
    protected String uniqueKey;

    @Column(value = "creationtime")
    protected Long creationTime;
}