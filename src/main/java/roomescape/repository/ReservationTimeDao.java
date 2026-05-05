package roomescape.repository;

import roomescape.domain.ReservationTime;

import java.util.List;
import java.util.Optional;

public interface ReservationTimeDao {

    ReservationTime save(ReservationTime time);

    Optional<ReservationTime> findById(Long timeId);

    List<ReservationTime> findAll();

    void deleteById(Long id);
}
