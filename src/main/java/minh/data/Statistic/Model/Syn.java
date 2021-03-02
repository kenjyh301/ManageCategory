package minh.data.Statistic.Model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("synthetic")
public class Syn {
    @PrimaryKey
    private String name;
    private int value;
    private float percent;
}
