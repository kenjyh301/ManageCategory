package minh.data.Statistic.Repository;

import minh.data.Statistic.Model.Syn;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SynRepository extends CassandraRepository<Syn, String> {
}
