package cts.ems.service;

import java.util.List;

import cts.ems.dto.Notification;

public interface NotificationService {
	
	public Notification createNotification(Long userId, Long eventId, String message);
	public List<Notification> getAllNotifications();
	public void deleteNotification(Long notificationId);
	public void notifyUserAboutEvent(Long userId, Long eventId, String eventDetails);
	public void sendReminderForUpcomingEvent(Long userId, Long eventId, String eventDetails);
	public void checkEventReminders();
	
}
