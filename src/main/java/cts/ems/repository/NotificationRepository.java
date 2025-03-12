package cts.ems.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import cts.ems.dto.Notification;



public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
}
